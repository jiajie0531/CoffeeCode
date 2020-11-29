package leetcode.easy;

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 *
 * @author jay
 */
public class Solution976 {
    public int largestPerimeter(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }

        return 0;
    }
}
