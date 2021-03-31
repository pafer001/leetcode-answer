package com.offer.answer._20_;

public class Exchange {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        final int[] exchange = new Exchange().exchange(nums);
        System.out.println(exchange);
    }

    public int[] exchange(int[] nums) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] % 2 == 0 && nums[end] % 2 == 1) {
                swap(nums, start, end);
            }
            if (nums[start] % 2 == 1) {
                start++;
            }

            if (nums[end] % 2 == 0) {
                end--;
            }


        }
        return nums;
    }

    private int[] swap(int[] nums, int start, int end) {

        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;

        return nums;
    }
}
