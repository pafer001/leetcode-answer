package com.offer.answer._14;

public class CuttingRope {


    public static void main(String[] args) {
        final int i = new CuttingRope().cuttingRope(5);
        System.out.println(i);
    }
    public int cuttingRope(int n) {

        int array[] = new int[n+1];
        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;

        for (int i=4; i <= n;i++) {

            int max = 0;
            for (int j = i-1; j >=0; j--) {

               int tmp = array[i-j] * array[j];
               if (tmp > max) {
                   max = tmp;
               }

            }
            array[i] = max;
        }

        return array[n];

    }
}
