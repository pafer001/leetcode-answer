package com.offer.answer._16;

public class MyPower {

    public double power(double x, int n) {

        if (x == 0) {
            return 0;
        }

        double res = 1.0;
        long b = n;

        if (b <0) {
            x = 1/x;
            b = -b;
        }

     while (b > 0) {

         if ((b & 1) == 1) {
             res *= x;
         }

         x = x * x;
         b = b >> 1;
     }

        return res;
    }
}
