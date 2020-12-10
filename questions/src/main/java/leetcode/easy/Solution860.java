package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 860. 柠檬水找零
 *
 * @author jay
 */
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> moneys = new HashMap<>();
        moneys.put(5, 0);
        moneys.put(10, 0);
        moneys.put(20, 0);
        System.out.println(moneys);

        if (bills.length == 0) {
            return Boolean.FALSE;
        }

        moneys.put(bills[0], moneys.get(bills[0]) + 1);

        for (int i = 1; i < bills.length; i++) {

            int income = bills[i];

            if (income == 5) {
                moneys.put(bills[i], moneys.get(bills[i]) + 1);
            } else if (income == 10) {
                if (moneys.get(5) == 0) {
                    return Boolean.FALSE;
                }
                moneys.put(5, moneys.get(5) - 1);
                moneys.put(bills[i], moneys.get(bills[i]) + 1);
            } else if (income == 20) {
                if (moneys.get(5) == 0) {
                    return Boolean.FALSE;
                }
                if (moneys.get(10) == 0) {
                    if (moneys.get(5) < 3) {
                        return Boolean.FALSE;
                    }
                }

                if (moneys.get(10) > 0 && moneys.get(5) > 0) {
                    moneys.put(10, moneys.get(10) - 1);
                    moneys.put(5, moneys.get(5) - 1);
                } else {
                    moneys.put(5, moneys.get(5) - 3);
                }
                moneys.put(bills[i], moneys.get(bills[i]) + 1);
            }


        }
        System.out.println("upgrade : " + moneys);
        return Boolean.TRUE;
    }
}
