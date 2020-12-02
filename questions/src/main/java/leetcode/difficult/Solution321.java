package leetcode.difficult;

import java.util.Arrays;

/**
 * 321. 拼接最大数
 *
 * @author jay
 */
public class Solution321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int[] maxSubsequence = new int[k];
        int start = Math.max(0, k - n);
        int end = Math.min(k, m);
        for (int i = start; i <= end; i++) {
            System.out.println("===");
            int[] subsequence1 = maxSubsequence(nums1, i);
            System.out.println("subsequence1: " + Arrays.toString(subsequence1));
            int[] subsequence2 = maxSubsequence(nums2, k - i);
            System.out.println("subsequence2: " + Arrays.toString(subsequence2));
            int[] curMaxSubsequence = merge(subsequence1, subsequence2);
            System.out.println("curMaxSubsequence: " + Arrays.toString(curMaxSubsequence));
            if (compare(curMaxSubsequence, 0, maxSubsequence, 0) > 0) {
                System.arraycopy(curMaxSubsequence, 0, maxSubsequence, 0, k);
            }
        }
        System.out.println("maxSubsequence: " + Arrays.toString(maxSubsequence));
        return maxSubsequence;
    }

    public int[] maxSubsequence(int[] nums, int k) {
        int length = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int remain = length - k;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            while (top >= 0 && stack[top] < num && remain > 0) {
                top--;
                remain--;
            }
            if (top < k - 1) {
                stack[++top] = num;
            } else {
                remain--;
            }
        }
        return stack;
    }

    public int[] merge(int[] subsequence1, int[] subsequence2) {
        int x = subsequence1.length;
        int y = subsequence2.length;
        if (x == 0) {
            return subsequence2;
        }
        if (y == 0) {
            return subsequence1;
        }
        int mergeLength = x + y;
        int[] merged = new int[mergeLength];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < mergeLength; i++) {
            if (compare(subsequence1, index1, subsequence2, index2) > 0) {
                merged[i] = subsequence1[index1++];
            } else {
                merged[i] = subsequence2[index2++];
            }
        }
        return merged;
    }

    public int compare(int[] subsequence1, int index1, int[] subsequence2, int index2) {
        int x = subsequence1.length;
        int y = subsequence2.length;
        while (index1 < x && index2 < y) {
            int difference = subsequence1[index1] - subsequence2[index2];
            if (difference != 0) {
                return difference;
            }
            index1++;
            index2++;
        }
        return (x - index1) - (y - index2);
    }
}
