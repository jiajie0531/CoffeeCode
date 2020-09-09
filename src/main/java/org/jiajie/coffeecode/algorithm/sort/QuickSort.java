package org.jiajie.coffeecode.algorithm.sort;

import java.util.Arrays;

/**
 * Quick Sort
 * @author jay
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param a 数组
     * @param n 数组的大小
     */
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n-1);
    }

    /**
     * 快速排序递归函数
     *
     * @param a 数组
     * @param p 起始下标
     * @param r 数组大小
     */
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) { return; }

        int q = partition(a, p, r);     // 获取分区点
        quickSortInternally(a, p, q-1);
        quickSortInternally(a, q+1, r);
    }

    /**
     * 获取分区点
     */
    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j){
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        System.out.println("partition i=" + i);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 8, 4, 12, 11, 13, 15, 7, 9, 0, -1};
        quickSort(arr, arr.length );

        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
