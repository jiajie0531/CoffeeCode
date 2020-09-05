package org.jiajie.coffeecode.algorithm.sort;

import java.util.Arrays;

/**
 * @author jay
 */
public class Sorts {

    /**
     * 插入排序
     * @param a array
     * @param n size
     */
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            // 查找要插入的位置并移动数据
            for (; j >= 0; --j) {
                if (a[j] > value){
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            System.out.println("*** j is " + j);
            System.out.println("*** a[ "+(j+1)+" ] = " + value);
            a[j + 1] = value;
        }
    }

    /**
     * 冒泡排序
     * @param a array
     * @param n size
     */
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; ++i) {
            // 提前退出标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    // 此次冒泡有数据交换
                    flag = true;
                }
            }
            if (!flag) {break;} // 没有数据交换，提前退出
        }
    }

    /**
     * 冒泡排序改进：在每一轮排序记录最后一次元素交换的位置，作为下次比较的边界，
     * 对于边界外的元素在下次循环中无需比较。
     * @param a array
     * @param n size
     */
    public static void bubbleSort2(int[] a, int n) {
        if (n <= 1) {return;}

        // 最后一次交换的位置
        int lastExchange = 0;
        // 无序数据的边界，每次只需要比较到这里即可退出
        int sortBorder = n - 1;
        for (int i = 0; i < n; i++) {
            // 提前退出标志位
            boolean flag = false;
            for (int j = 0; j < sortBorder; j++) {
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    // 此次冒泡有数据交换
                    flag = true;
                    // 更新最后一次交换的位置
                    lastExchange = j;
                }
            }
            sortBorder = lastExchange;
            if (!flag) { break; }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        insertionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
