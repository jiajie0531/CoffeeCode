package leetcode.middle;

import java.util.Arrays;

/**
 * 621. 任务调度器
 *
 * @author jay
 */
public class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length <= 1 || n < 1) {
            return tasks.length;
        }
        // step 1 桶计法
        int[] counts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            counts[tasks[i] - 'A']++;
        }
        // step 2 sort
        Arrays.sort(counts);
        int maxCount = counts[25];
        int retCount = (maxCount - 1) * (n + 1) + 1;
        int i = 24;
        // step 3
        while (i >= 0 && counts[i] == maxCount) {
            retCount++;
            i--;
        }
        // step 4
        return Math.max(retCount, tasks.length);
    }
}
