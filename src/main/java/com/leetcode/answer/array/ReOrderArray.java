package com.leetcode.answer.array;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {
    public int[] reOrderArray (int[] array) {
        // write code here

        List<Integer> list1 =   new ArrayList<Integer>();
        List<Integer> list2 =   new ArrayList<Integer>();


        for(int i= 0; i< array.length ; i++) {

            if(array[i] %2 ==0) {
                list1.add(array[i]);
            } else {
                list2.add(array[i]);
            }
        }
        list2.addAll(list1);

        int[] array1 =   new int[array.length];

        for (int i =0; i< array.length; i++) {
            array1[i] = list2.get(0);
        }
        return array1;
    }
}
