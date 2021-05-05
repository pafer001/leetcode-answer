package com.leetcode.answer.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum1 {

    public static void main(String[] args) {

        int[] num = {-2, 0, 1, 1, 2};

        final ArrayList<ArrayList<Integer>> arrayLists = new ThreeSum1().threeSum(num);
        System.out.println(arrayLists);
    }

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);

        for (int index = 0; index < num.length; index++) {
            int indexVal = num[index];
            int low = 0;
            int high = num.length - 1;

            while (high > index && index > low) {

                int tmpSum = num[high] + num[low] + indexVal;
                if (tmpSum == 0) {
                    ArrayList<Integer> tmpList = new ArrayList();
                    tmpList.add(num[low]);
                    tmpList.add(num[index]);
                    tmpList.add(num[high]);

                    ret.add(tmpList);
                    low++;

                } else if (tmpSum > 0) {
                    high--;
                } else {
                    low++;
                }

            }


        }

        return ret;

    }
}
