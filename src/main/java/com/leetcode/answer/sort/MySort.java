package com.leetcode.answer.sort;

import javax.xml.soap.Node;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MySort {

    public static void main(String[] args) {

        int[] array = {5,1,6,2,5};
        final int[] ints = new MySort().MySort(array);
    }
    public int[] MySort(int[] arr) {
        // write code here

        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = findIndex(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index + 1, right);

    }

    int findIndex(int[] arr, int left, int right) {

//        Arrays.sort(arr, new Comparable<Node>() {
//            @Override
//            public int compareTo(Node o) {
//                return 0;
//            }
//        });

        Node[] array = new Node[10];
        Arrays.sort(array, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return 0;
            }
        });

        int tmp = arr[left];

        while (right > left) {
            while (arr[right] >= tmp && right > left) {

                right--;
            }

            arr[left] = arr[right];
            while (arr[left] <= tmp && right > left) {
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = tmp;
        return left;


    }

    class Node {
        int index;
        int value;
    }
}
