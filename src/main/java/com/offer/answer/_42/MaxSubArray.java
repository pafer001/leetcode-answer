package com.offer.answer._42;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        final int i = new MaxSubArray().maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] resNums = new int[nums.length];

        resNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (resNums[i - 1] < 0) {
                resNums[i] = nums[i];

            } else {
                resNums[i] = resNums[i - 1] + nums[i];
            }
            if (max < resNums[i]) {
                max = resNums[i];
            }

        }

        return max;
    }
}
