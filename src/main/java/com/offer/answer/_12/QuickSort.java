package com.offer.answer._12;

import com.offer.answer._4.FindNumberIn2DArray;

public class QuickSort {

    public int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public  void quickSort(int[] arr, int left, int right) {
        int middle;
        if (left < right) {
            middle = partition(arr, left, right);
            quickSort(arr, left, middle - 1);
            quickSort(arr, middle + 1, right);
        }
    }

    public int partition(int[] array, int start, int end) {

        int index = array[start];

        while (start < end) {

            while (start < end && array[end] >= index) {

                end--;
            }
            array[start] = array[end];

            while (start < end && array[start] <= index) {

                start++;
            }
            array[end] = array[start];

        }
        array[start] = index;

        return start;


    }

}
