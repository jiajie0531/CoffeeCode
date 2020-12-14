package leetcode.middle;

/**
 * 376. 摆动序列
 *
 * @author jie
 * @date 2020/12/12 8:25 AM
 */
public class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        int down = 1;
        int up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return nums.length == 0 ? 0 : Math.max(down, up);
    }
}
