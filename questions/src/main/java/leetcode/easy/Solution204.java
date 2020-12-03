package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 204. 计数质数
 * 质数定义是：在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
 * 例如，2，3，5，7，11，13，17 ….是素数。
 *
 * @author jay
 */
public class Solution204 {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private boolean isPrime(int x) {
        for (int i = 2; i * i <= x ; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
