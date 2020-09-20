package org.jiajie.coffeecode.algorithm;

/**
 * BM 算法
 * @author jay
 */
public class BoyerMoore {

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
}
