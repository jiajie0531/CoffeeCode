package leetcode.middle;

/**
 * 767. 重构字符串
 *
 * @author jay
 */
public class Solution767 {
    public String reorganizeString(String S) {
        if (S.length() < 2) {
            return S;
        }
        int evenIndex = 0;
        int oddIndex = 1;
        int length = S.length();
        int halfLength = length / 2;
        char[] reorganizeArray = new char[length];

        int[] counts = new int[26];
        int maxCount = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            counts[c - 'a']++;
            maxCount = Math.max(maxCount, counts[c - 'a']);
        }

        if (maxCount > (length + 1) / 2) {
            return "";
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            while (counts[i] > 0 && counts[i] <= halfLength && oddIndex < length) {
                reorganizeArray[oddIndex] = c;
                counts[i]--;
                oddIndex += 2;
            }
            while (counts[i] > 0) {
                reorganizeArray[evenIndex] = c;
                counts[i]--;
                evenIndex += 2;
            }
        }

        return new String(reorganizeArray);
    }
}
