package leetcode.middle;

import java.util.*;

/**
 * 659. 分割数组为连续子序列
 *
 * @author jay
 */
public class Solution659 {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();

        for (int x : nums) {
            if (!map.containsKey(x)) {
                map.put(x, new PriorityQueue<Integer>());
            }
            if (map.containsKey(x - 1)) {
                int prevLength = map.get(x - 1).poll();
                if (map.get(x - 1).isEmpty()) {
                    map.remove(x - 1);
                }
                map.get(x).offer(prevLength + 1);
            } else {
                map.get(x).offer(1);
            }
        }

        Set<Map.Entry<Integer, PriorityQueue<Integer>>> entrySet = map.entrySet();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : entrySet) {
            PriorityQueue<Integer> queue = entry.getValue();
            if (queue.peek() < 3) {
                return false;
            }
        }
        return true;
    }
}
