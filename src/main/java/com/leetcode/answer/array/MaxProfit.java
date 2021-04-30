package com.leetcode.answer.array;

public class MaxProfit {
    public static void main(String[] args) {
        int[] array = {2,1};

        final int i = new MaxProfit().maxProfit(array);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        // write code here
        int[] minPrice = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            minPrice[i] = prices[i];
        }

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice[i] = Math.min(minPrice[i - 1], prices[i]);
            if (prices[i] -  minPrice[i] > maxProfit) {
                maxProfit = prices[i] -  minPrice[i];
            }
        }


        return maxProfit;

    }

}
