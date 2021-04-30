package com.leetcode.answer.array;

import java.util.LinkedList;

public class Ysf {

    public static void main(String[] args) {
//        final int ysf = new Ysf().ysf(43, 9001);
        final int ysf = new Ysf().ysf(43, 9001);

        System.out.println(ysf);
    }


    public int ysf(int n, int m) {

        final LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i, i);
        }

        int i = 0;
        while (list.size() > 1) {

            int flag = 1;
            while (true) {

                if (flag == m) {

                    list.remove(i % list.size());
                    break;
                }
                flag++;
                i++;
                if (i == list.size()) {
                    i = 0;
                }
            }
        }
        return list.get(0) + 1;

    }
}
