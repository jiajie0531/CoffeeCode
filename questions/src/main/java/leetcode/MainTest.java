package leetcode;

import leetcode.difficult.Solution321;
import leetcode.easy.Solution118;
import leetcode.easy.Solution204;
import leetcode.easy.Solution860;
import leetcode.middle.*;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("***");

        Solution376 solution376 = new Solution376();
        int[] A = new int[]{5, 5, 10, 10, 20};
        System.out.println(solution376.wiggleMaxLength(A));

//        Solution649 solution649 = new Solution649();
//        System.out.println(solution649.predictPartyVictory("RDD"));

//        Solution860 solution860 = new Solution860();
//        int[] A = new int[]{5, 5, 10, 10, 20};
//        System.out.println(solution860.lemonadeChange(A));

//        Solution861 solution861 = new Solution861();
//        int[][] A = new int[][]{
//                {0,0,1,1},{1,0,1,0},{1,1,0,0}
//        };
//
//        System.out.println(solution861.matrixScore(A));

//        Solution118 solution118 = new Solution118();
//        System.out.println(solution118.generate(5));

//        Solution659 solution659 = new Solution659();
//        int[] nums = new int[]{1,2,3,3,4,5};
//        System.out.println(solution659.isPossible(nums));

//        Solution204 solution204 = new Solution204();
//        System.out.println(solution204.countPrimes(3));

//        Solution321 solution321 = new Solution321();
//        int[] nums1 = new int[]{3, 4, 6, 5};
//        int[] nums2 = new int[]{9, 1, 2, 5, 8, 3};
//        int k = 5;
//        System.out.println(Arrays.toString(solution321.maxNumber(nums1, nums2, k)));

//        Solution767 solution767 = new Solution767();
//        System.out.println(solution767.reorganizeString("aaab"));

//        Solution454 solution454 = new Solution454();
//        System.out.println(solution454.fourSumCount(
//                new int[]{-1, -1},
//                new int[]{-1, 1},
//                new int[]{-1, 1},
//                new int[]{1, -1}
//        ));
//        Solution452 solution452 = new Solution452();
//        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
//        System.out.println(solution452.findMinArrowShots(points));

//        Solution1370 solution1370 = new Solution1370();
//        System.out.println(solution1370.sortString("aaaabbbbcccc"));
    }
}
