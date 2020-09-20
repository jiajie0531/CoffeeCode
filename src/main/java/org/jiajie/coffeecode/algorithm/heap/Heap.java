package org.jiajie.coffeecode.algorithm.heap;

/**
 * 堆排序
 *
 * @author jie
 * @date 2020/9/13 8:11 AM
 */
public class Heap {
    /**
     * 数组，从下标1开始存储数据
     */
    private int[] a;
    /**
     * 堆可以存储的最大数据个数
     */
    private int n;
    /**
     * 堆中已经存储的数据个数
     */
    private int count;

    public Heap(int capacity) {
        a = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    public void insert(int data) {
        /* 堆满了 */
        if (count >= n) {
            return;
        }
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]) {
            /* 自下往上堆化，swap()函数作用：交换下标为i和i/2的两个元素 */
            swap(a,i, i/2);
            i = i/2;
        }
    }

    /**
     * swap()函数作用：交换下标为i和i/2的两个元素
     * @param a 数组，从下标1开始存储数据
     * @param i 下标为i的元素
     * @param i1 下标i/2的元素
     */
    private void swap(int[] a, int i, int i1) {
    }
}
