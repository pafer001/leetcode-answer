package com.leetcode.answer.sort;

/**
 * 给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短序列。函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。
 * 示例：
 * 输入： [1,2,4,7,10,11,7,12,6,7,16,18,19]
 * 输出： [3,9]
 * 提示：
 * 0 <= len(array) <= 1000000
 */
public class SubSort {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9};

        final int[] arr = new SubSort().subSort(array);
        System.out.println(arr);
    }

    public int[] subSort(int[] array) {
        if (array == null || array.length <= 1) {
            return new int[]{-1, -1};
        }

        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] >= min) {
                min = array[i];
            } else {
                left = i;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] <= max) {
                max = array[i];
            } else {
                right = i;
            }
        }
        return left > right ? new int[]{right, left} : new int[]{-1, -1};
    }
}
