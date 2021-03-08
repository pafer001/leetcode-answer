package com.offer.answer._15;

public class NumberOf1 {




    public static void main(String[] args) {

        final int i = new NumberOf1().numberOff1_1(Integer.MAX_VALUE );
        System.out.println(i);

        System.out.println(Integer.MAX_VALUE);
    }

    public int numberOff1(int n) {

        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }

            n = n >>> 1;
        }

        return count;
    }



    public int numberOff1_1(int n) {

        int count = 0;
        while (n != 0) {
            n = (n & (n-1));
            count ++;

        }
        return count;

    }

}
