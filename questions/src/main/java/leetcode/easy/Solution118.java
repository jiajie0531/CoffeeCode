package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author jay
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        for (int i = 1; i <= numRows; i++) {
            List<Integer> items = new ArrayList<>();
            List<Integer> prevItems = new ArrayList<>();
            if (i == 1) {
                items = new ArrayList<>();
                items.add(1);
                triangle.add(items);
            }
            if (i == 2) {
                items = new ArrayList<>();
                items.add(1);
                items.add(1);
                triangle.add(items);
            }
            if (i >= 3) {
                items = new ArrayList<>();
                prevItems = triangle.get(i - 2);
                items.add(1);
                for (int j = 1; j < prevItems.size(); j++) {
                    items.add(prevItems.get(j - 1) + prevItems.get(j));
                }
                items.add(1);
                triangle.add(items);
            }
        }
        return triangle;
    }
}
