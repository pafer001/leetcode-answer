package com.leetcode.answer.str;

public class BigDataMultySolve {

    public static void main(String[] args) {
        final String solve = new BigDataMultySolve().solve("11", "99");
        System.out.println(solve);
    }

    public String solve(String s, String t) {
        String result = "";
        int tmp = 0;

        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;

        while (sIndex >= 0 || tIndex >= 0 || tmp != 0) {


            int sVal = sIndex >= 0 ? Integer.parseInt(String.valueOf(s.charAt(sIndex))) : 1;
            int tVal = tIndex >= 0 ? Integer.parseInt(String.valueOf(t.charAt(tIndex))) : 1;

            int tmpValue = sVal * tVal + tmp;
            result = (tmpValue % 10) + result;

            tmp = tmpValue / 10;

            sIndex--;
            tIndex--;

        }

        return result;


    }
}
