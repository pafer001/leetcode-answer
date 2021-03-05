package com.offer.answer._11;

public class NumWays {
    public int numWays(int n) {

        int f1 = 1;
        int f2 = 2;

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return f1;
        }

        if (n == 2) {
            return f2;
        }
        int fi = 0;
        for (int i = 3; i <= n; i++) {
            fi = (f1 + f2) % 1000000007;

            f1 = f2;
            f2 = fi;
        }

        return fi;
    }
}
