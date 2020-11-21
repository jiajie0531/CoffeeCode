package org.jiajie.coffeecode.algorithm;

/**
 * BM 算法
 * @author jay
 */
public class BoyerMoore {

    private static final int SIZE = 256;    // 全局变量或成员变量

    /**
     * algorithm boyer-moore
     *
     * @param a 主串
     * @param n 主串的长度
     * @param b 模式串
     * @param m 模式串的长度
     * @return 返回主串与模式串的第一个匹配的字符位置
     */
    public int bm(char[] a, int n, char[] b, int m) {
        int[] bc = new int[SIZE]; // 记录模式串中每个字符最后出现的位置
        generateBC(b, m, bc);   // 构建坏字符哈希表
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];
        generateGS(b, m, suffix, prefix);
        int i = 0;  // j表示主串与模式串匹配的第一个字符
        while (i <= n - m) {
            int j;
            for (j = m-1; j >= 0 ; --j) {   // 模式串从后往前匹配
                if (a[i+j] != b[j]) {break;}  // 坏字符对应模式串中的下标是j
            }
            if (j < 0) {
                return i;   // 匹配成功，返回主串与模式串第一个匹配的字符的位置
            }
            int x = j - bc[(int)a[i+j]];
            int y = 0;
            if (j < m-1) { // 如果有好后缀的话
                y = moveByGS(j, m, suffix, prefix);
            }
            i = i + Math.max(x, y);
        }
        return -1;
    }

    /**
     * generate BC
     *
     * @param b 模式串
     * @param m 模式串的长度
     * @param bc    散列表
     */
    private void generateBC(char[] b, int m, int[] bc){
        for (int i = 0; i < SIZE; i++) {
            bc[i] = -1; // 初始化bc
        }
        for (int i = 0; i < m; i++) {
            int ascii = (int)b[i];  // 计算b[i]的ASCII值
            bc[ascii] = i;
        }
    }

    /**
     * generateGS
     *
     * @param b 模式串
     * @param m 长度
     * @param suffix 后缀数组
     * @param prefix 前缀数组
     */
    private void generateGS(char[] b, int m, int[] suffix, boolean[] prefix) {
        for (int i = 0; i < m; i++) { // 初始化
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; i++) {   // b[0, i]
            int j = i;
            int k = 0; // 公众后缀子串长度
            while (j >= 0 && b[j] == b[m-1-k]) {
                // 与b[0,m-1]求公众后缀子串
                --j;
                ++k;
                // j+1表示公共后缀子串在b[0,i]中的起始下标
                suffix[k] = j+1;
            }
        }
    }

    /**
     * move by GS
     *
     * @param j 坏字符对应的模式串中的字符下标
     * @param m 模式串长度
     * @param suffix 后缀
     * @param prefix 前缀
     * @return 位置
     */
    private int moveByGS(int j, int m, int[] suffix, boolean[] prefix) {
        int k = m - 1 - j; // 好后缀长度
        if (suffix[k] != -1) {
            return j - suffix[k] + 1;
        }
        for (int r = j + 2; r <= m - 1 ; ++r) {
            if (prefix[m-r] == true) {
                return r;
            }
        }
        return m;
    }
}
