package com.offer.answer._5;

public class ArrayInsertSort {

    public static void main(String[] args) {
        int[] array1 = new int[1000];

        System.out.println(array1.length);
    }

    public int[] insertSort(int[] array1, int[] array2) {

        if (array1 == null) {
            return array2;
        }

        if (array2 == null) {

            return array1;
        }

        int lastIndex1 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == -1) {
                lastIndex1 = i;
                break;
            }
        }


        int i = array2.length - 1;
        int j = lastIndex1;

        int index = array1.length - 1;

        while (i >= 0 && j >= 0) {

            if (array1[j] >= array2[i]) {
                array2[index--] = array1[j];
                j--;
            }

            if (array1[j] < array2[i]) {
                array2[index--] = array2[i];
                i--;
            }

        }

        while (i >= 0) {
            array2[index--] = array2[i];
            i--;
        }

        return array1;

    }
}
