package com.leetcode.answer.array;

public class MaxProduct {

    public static void main(String[] args) {

        double[] nums = {-2,3,-4};

        final double i = new MaxProduct().maxProduct(nums);
        System.out.println(i);
    }
    public double maxProduct(double[] nums) {
        double[] maxArray = new double[nums.length];
        double[] minArray = new double[nums.length];
        double max = nums[0];
        if(nums[0] > 0) {
            maxArray[0] = nums[0];
        } else {
            minArray[0] = nums[0];
        }

        for(int i=1; i< nums.length; i++) {
            double aValue = nums[i];
            if(aValue >= 0) {

                double tmpMax = Math.max( aValue * maxArray[i-1], aValue );
                maxArray[i] = tmpMax;
                double tmpMin = Math.min( aValue * minArray[i-1], aValue );
                minArray[i] = tmpMin;

                if(max < tmpMax) {
                    max = tmpMax;
                }
            } else {
                double tmpMax = Math.max( aValue * minArray[i-1], aValue );
                maxArray[i] = tmpMax;
                double tmpMin = Math.min( aValue * maxArray[i-1], aValue );
                minArray[i] = tmpMin;

                if(max < tmpMax) {
                    max = tmpMax;
                }
            }
        }

        return max;



    }
}
