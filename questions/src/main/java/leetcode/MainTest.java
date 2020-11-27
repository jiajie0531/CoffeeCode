package leetcode;

import leetcode.middle.Solution454;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("***");
        Solution454 solution454 = new Solution454();
        System.out.println(solution454.fourSumCount(
                new int[]{-1, -1},
                new int[]{-1, 1},
                new int[]{-1, 1},
                new int[]{1, -1}
        ));
//        Solution452 solution452 = new Solution452();
//        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
//        System.out.println(solution452.findMinArrowShots(points));

//        Solution1370 solution1370 = new Solution1370();
//        System.out.println(solution1370.sortString("aaaabbbbcccc"));
    }
}
