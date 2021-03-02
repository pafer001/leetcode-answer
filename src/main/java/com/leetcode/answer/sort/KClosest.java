package com.leetcode.answer.sort;

import java.util.Arrays;
import java.util.Comparator;

public class KClosest {

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int K =  1;

        final int[][] ints = new KClosest().kClosest(points, K);
        System.out.println(ints);
    }
    public int[][] kClosest(int[][] points, int K) {

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o1[0] + o1[1] * o1[1] -  o2[0] * o2[0] - o2[1] * o2[1];
            }
        });

        int [][] res = new int[K][2];

        for (int idx = 0; idx < K; idx++) {
            res[idx] = points[idx];
        }
        return res;

    }
}
