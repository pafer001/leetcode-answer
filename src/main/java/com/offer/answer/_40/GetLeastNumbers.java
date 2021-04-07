package com.offer.answer._40;

public class GetLeastNumbers {

//    public int[] getLeastNumbers(int[] arr, int k) {
//
//        buildHeap(arr);
//
//        final int[] res = new int[k];
//        for (int i=0;i<k; i++) {
//
//            res[i] = arr[0];
//            swap(arr, length - 1, 0);
//
//        }
//
//    }

    public static void sort(int[] array) {
        buildHeap(array);

    }
    private static void buildHeap(int[] array) {

        for (int i = array.length; i >= 0; i--) {
            smallAdjust(array, i, array.length);
        }
        for(int j=array.length-1;j>0;j--){
            swap(array,0,j);//将堆顶元素与末尾元素进行交换
            smallAdjust(array,0,j);//重新对堆进行调整
        }
    }
    public static void smallAdjust(int[] arr, int i, int length) {

        int index = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && arr[left] < arr[index]) {
            index = left;
        }

        if (right < length && arr[right] < arr[index]) {
            index = right;
        }

        if (index != i) {
            swap(arr, index, left);
            smallAdjust(arr, index, length);
        }

    }

    public static void swap(int[] arr, int i, int j) {

        final int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }
}
