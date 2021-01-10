package com.leetcode.answer.sort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    public static void main(String[] args) {
//        [[2,3],[2,2],[3,3],[1,3],[5,7],[2,2],[4,6]]
        int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};
        final int[][] merge = new Merge().merge(intervals);
        System.out.println(merge);
    }
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> result = new ArrayList<>();

        int[] pre = intervals[0];
        for (int i =1; i < intervals.length; i++) {

            if (pre[1] >= intervals[i][0] && pre[1] <= intervals[i][1]) {
                pre[1] = intervals[i][1];
            }

            if (pre[1] < intervals[i][0] ) {
                result.add(pre);
                pre = intervals[i];
            }
//            if (pre[1] >= intervals[i][1] ) {
//                result.add(pre);
//                pre = intervals[i];
//            }
        }
        result.add(pre);
        int[][]  tmp = new  int[result.size()][2];
        result.toArray(tmp);
        return tmp;
    }
}
