package com.offer.answer._53;

public class SearchSortArray {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};

        final int search = new SearchSortArray().search(nums, 8);
        System.out.println(search);
    }

    public int search(int[] nums, int target) {

        return getIndex(nums, target) - getIndex(nums, target - 1);
    }

    public int getIndex(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}


