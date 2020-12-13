package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 * @author jie
 * @date 2020/12/13 7:43 AM
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sorts = new HashSet<>();
        for (int item : nums) {
            if (!sorts.add(item)){
                return true;
            }
        }
        return false;
    }
}
