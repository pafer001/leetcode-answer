package com.offer.answer._61;

import java.util.Arrays;

public class IsStraight {

    public static void main(String[] args) {

        int[] array = {0,0,8,5,4};

        final boolean straight = new IsStraight().isStraight(array);
        System.out.println(straight);
    }
    public boolean isStraight(int[] nums) {

        Arrays.sort(nums);
        int zeroSize = 0;
        for (int i=0; i< nums.length; i++) {

            final int num = nums[i];
            if (num ==0) {
                zeroSize ++;
                continue;
            }
            if (i == 0){
                continue;
            }



            if (nums[i-1] ==0) {
                continue;
            }
            if (nums[i] - nums[i-1] == 0) {
                return false;
            }

            if (nums[i] - nums[i-1] > 1) {

                zeroSize =  zeroSize - (nums[i] - nums[i-1] -1);
            }

            if (zeroSize < 0) {
                return false;
            }

        }

        return true;
    }
}
