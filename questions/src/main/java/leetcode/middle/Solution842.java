package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 842. 将数组拆分成斐波那契序列
 *
 * @author jay
 */
public class Solution842 {

    List<Integer> ans;

    public List<Integer> splitIntoFibonacci(String S) {
        ans = new ArrayList<>();
        return dfs(0, S, 0, 0, 0) ? ans : new ArrayList<>();
    }

    /**
     * 回溯
     *
     * @param p    当前指针指向数组的索引
     * @param s    字符串
     * @param pre1 前面隔一个的数
     * @param pre2 前一个数
     * @param deep 当前是第几个数
     * @return 数组
     */
    private boolean dfs(int p, String s, int pre1, int pre2, int deep) {
        int length = s.length();
        if (p == length) {
            return deep >= 3;
        }

        for (int i = 1; i < 11; i++) {
            // 超出长度或者以0开头直接break;
            if (p + i > length || (s.charAt(p) == '0' && i > 1)) {
                break;
            }
            // 截取字符串
            String sub = s.substring(p, p + i);

            Long numL = Long.parseLong(sub);

            // 判断是否超出范围，或者deep不是0，1，却大于他的前两个数之和
            if (numL > Long.MAX_VALUE || (deep != 0 && deep != 1 && numL > (pre1 + pre2))) {
                break;
            }

            Integer num = numL.intValue();

            if (deep == 0 || deep == 1 || num.equals(pre1 + pre2)) {
                ans.add(num);
                if (dfs(p + i, s, pre2, num, deep + 1)) {
                    return true;
                }
                ans.remove(num);
            }
        }
        return false;
    }


}
