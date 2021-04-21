package com.offer.answer._63;

public class MaxProfit {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice =  price;
            } else if (price - minPrice > maxProfit) {

                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

}
