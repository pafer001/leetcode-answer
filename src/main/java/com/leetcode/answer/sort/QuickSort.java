package com.leetcode.answer.sort;

public class QuickSort {

    public static void main(String[] args) {
        int n[] = { 6, 5, 2, 7, 3, 9, 8, 4, 10, 1 };
        new QuickSort().quickSort(n);
        System.out.print("快排结果：");
        for (int m : n) {
            System.out.print(m + " ");
        }
    }

    public void quickSort(int[] array) {

        quickSort(array, 0, array.length -1);
    }

    public void quickSort(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex >= rightIndex) {
            return;
        }
        int left = leftIndex, right =  rightIndex;

        int index = array[left];

        while (left < right) {
            while (left < right && array[right] <= index) {

                right --;
            }

            while (left < right && array[left] >= index) {

                left ++;
            }



            swap(array, left, right);

        }

        swap(array, leftIndex, left);


        quickSort(array, leftIndex, left -1);
        quickSort(array, left + 1, rightIndex);


    }

    private void swap(int[] array, int left, int right) {

        final int tmp = array[left];

        array[left] = array[right];
        array[right] = tmp;


    }
}
