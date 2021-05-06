package com.leetcode.answer.array;

public class SolveArray {

    public static void main(String[] args) {
        int[] array = {2, 51, 12, 95, 42, 52, 76, 77, 23, 81, 71, 41, 2, 23, 43, 4, 64, 22, 71, 96, 1, 87, 51, 91, 67, 16,
                58, 11, 44, 38, 63, 14, 4, 69, 88, 49, 92, 91, 9, 15, 17, 74, 21, 91, 24, 78, 62, 50, 82, 26, 53, 18, 25,
                14, 94, 79, 44, 11, 36, 38, 44, 53, 9, 34, 58, 6, 50, 82, 81, 50, 36, 1, 6, 61, 9, 47, 33, 47, 84, 41, 57, 48, 73, 18};
        final int solve = new SolveArray().solve(array);
        System.out.println(solve);
    }

    public int solve(int[] a) {
        if (a.length == 1) {
            return 0;
        }
        // write code here
        long maxValue = Long.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                if (a[i + 1] <= a[i]) {
                    maxIndex = i;
                }
            } else if (i == a.length - 1) {

                if (a[i - 1] <= a[i]) {
                    maxIndex = i;

                }
            } else {
                if (a[i + 1] <= a[i] && a[i - 1] <= a[i]) {
                    maxIndex = i;

                }
            }
        }
        return maxIndex;
    }

}
