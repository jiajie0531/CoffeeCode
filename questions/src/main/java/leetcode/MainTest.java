package leetcode;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("***");
        Solution452 solution452 = new Solution452();
        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        System.out.println(solution452.findMinArrowShots(points));
    }
}
