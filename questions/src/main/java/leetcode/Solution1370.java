package leetcode;

/**
 * 1370. 上升下降字符串
 *
 * @author jay
 */
public class Solution1370 {
    public String sortString(String s) {
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }

        StringBuffer result = new StringBuffer();
        while (result.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (nums[i] > 0) {
                    result.append((char) (i + 'a'));
                    nums[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (nums[i] > 0) {
                    result.append((char) (i + 'a'));
                    nums[i]--;
                }
            }
        }
        return result.toString();
    }


}
