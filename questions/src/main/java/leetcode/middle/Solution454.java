package leetcode.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 *
 * @author jay
 */
public class Solution454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> countAB = new HashMap<>();
        for (int u : A) {
            for (int v : B) {
                countAB.put(u + v, countAB.getOrDefault(u + v, 0) + 1);
            }
        }
        int ans = 0;
        for (int k : C) {
            for (int l : D) {
                if (countAB.containsKey(-k - l)) {
                    ans += countAB.get(-k-l);
                }
            }
        }
        return ans;
    }

}
