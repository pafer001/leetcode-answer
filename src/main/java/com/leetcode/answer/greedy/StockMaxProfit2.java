package com.leetcode.answer.greedy;

public class StockMaxProfit2 {

    public static void main(String[] args) {
        int[] array = {8,9,3,5,1,3};
        final int maxProfit = new StockMaxProfit2().maxProfit(array);
        System.out.println(maxProfit);
    }
    public int maxProfit (int[] prices) {
        int[] dp  = new int[prices.length];
        int[] dp2  = new int[prices.length];

        dp[0] = -prices[0];
        int minPrice = prices[0];

        for(int i=1; i< prices.length; i++) {
            dp[i] = Math.max(dp[i-1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

//        dp2[prices.length-1] =  prices[prices.length-1];
        int maxPrice = prices[prices.length-1];
        for(int i= prices.length -2; i>=0; i--) {

            dp2[i] = Math.max(maxPrice - prices[i],  dp2[i+1]);
            maxPrice = Math.max(prices[i], maxPrice) ;
        }

        int max = 0;
        for(int i =1; i<prices.length; i++) {

            max = Math.max(dp[i-1] + dp2[i], max);
        }

        return Math.max(max, dp[prices.length -1]);
    }
}
