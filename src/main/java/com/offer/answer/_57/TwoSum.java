package com.offer.answer._57;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {1,2,4,7,11,15};
        final int[] array = new TwoSum().twoSum(nums, 20);
        System.out.println(array);
    }

    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length -1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum > target) {
                right --;
            } else if (sum < target){
                left ++;
            } else {
                return new int[] {nums[left], nums[right]};
            }

        }

        return new int[] {};
    }
}
