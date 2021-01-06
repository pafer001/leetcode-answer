package com.leetcode.answer.dump;

public class MaxHeapSort {

    public static void main(String[] args) {

        int[] array = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        new MaxHeapSort().buildHeap(array);
        System.out.println(array);
    }

    public void buildHeap(int[] array) {

        for (int i = array.length / 2; i >= 0; i--) {
            maxAdjust(array, i, array.length);
        }
    }

    private void maxAdjust(int[] array, int i, int length) {

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int max = i;
        if (l < length && array[l] > array[max]) {
            max = l;
        }

        if (r < length && array[r] > array[max]) {
            max = r;
        }

        if (max != i) {

            swap(array, max, i);

            maxAdjust(array, max, length);
        }

    }

    private void swap(int[] array, int i, int j) {

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
