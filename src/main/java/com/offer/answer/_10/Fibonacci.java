package com.offer.answer._10;

public class Fibonacci {

    public static void main(String[] args) {
        final int fibonacci = new Fibonacci().fibonacci(2);
        System.out.println(fibonacci);
    }
    public int fibonacci(int n) {

        int f1 = 0;
        int f2 = 1;

        if (n == 0) {
            return f1;
        }

        if (n == 1) {
            return f2;
        }
        int fi = 0;
        for (int i = 2; i <= n; i++) {
            fi = f1 + f2;

            f1 = f2;
            f2 = fi;
        }

        return fi;
    }
}
