package leetcode;

/**
 * @author jie
 * @date 2020/11/22 7:34 AM
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] tables = new int[26];
        for (int i = 0; i < s.length(); i++) {
            tables[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tables[t.charAt(i) - 'a']--;

            if (tables[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
