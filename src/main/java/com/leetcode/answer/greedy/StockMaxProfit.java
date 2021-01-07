package com.leetcode.answer.greedy;

public class StockMaxProfit {

    public static void main(String[] args) {

        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;

        final int profit = new StockMaxProfit().maxProfit(prices, fee);

        System.out.println(profit);
    }

    /**
     * array[i][0] 不持有
     * array[i][1] 持有
     *
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {

        int[][] array = new int[prices.length][2];

        array[0][0] = 0;
        array[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {

            array[i][0] = max(array[i - 1][0], prices[i] + array[i - 1][1] - fee);
            array[i][1] = max(array[i - 1][0] - prices[i], array[i - 1][1]);
        }

        return array[prices.length - 1][0];
    }

    int max(int a, int b) {

        if (a > b) {
            return a;
        }
        return b;
    }
}
