package com.offer.answer._49;

public class NthUglyNumber {

    public static void main(String[] args) {

        final int i = new NthUglyNumber().nthUglyNumber(11);
        System.out.println(i);
    }
    public int nthUglyNumber(int n) {

        int dp[] = new int[n+1];
        dp[1] = 1;

        int _2Index = 1;
        int _3Index = 1;
        int _5Index = 1;

        int num = 1;
        for (int index = 2; index <= n; index++) {
            final int num2 = dp[_2Index] * 2;
            final int num3 = dp[_3Index] * 3;
            final int num5 = dp[_5Index] * 5;

            num = Math.min(Math.min(num2, num3), num5);
            if (num ==  num2) {
                _2Index++;
            }

            if (num ==  num3) {
                _3Index++;
            }

            if (num ==  num5) {
                _5Index++;
            }
            dp[index] = num;
        }

        return num;
    }
}
