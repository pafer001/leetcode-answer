package com.offer.answer._57;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {

    public static void main(String[] args) {
        final int[][] continuousSequence = new FindContinuousSequence().findContinuousSequence(15);
        System.out.println(continuousSequence);
    }

    List<int[]> arrayList = new ArrayList<>();

    public int[][] findContinuousSequence(int target) {

        int index = 1;
        while (index != -1) {
            index = findContinuousSequence(index, target);
        }

        int[][] array = new int[arrayList.size()][];
        arrayList.toArray(array);
        return array;
    }

    public int findContinuousSequence(int index, int target) {

        int low = index;
        int sum = index;

        int high = index + 1;

        while (high < target) {
            sum += high;

            if (sum < target) {
                high++;
            } else if (sum == target) {

                arrayList.add(parseArray(low, high));
                return low + 1;
            } else {
                return low + 1;
            }
        }

        return -1;

    }

    public int[] parseArray(int low, int high) {

        final int[] array = new int[high - low + 1];

        for (int i = 0; i <= high - low; i++) {
            array[i] = low + i;
        }
        return array;
    }
}
