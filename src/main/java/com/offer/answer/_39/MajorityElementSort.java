package com.offer.answer._39;

public class MajorityElementSort {

    public int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
//        quickSort(nums, 0, nums.length -1);
//
//        return nums[nums.length /2];

        return majorityElement(nums, 0, nums.length - 1);
    }


//    public static void main(String[] args) {
//        int[] array = {1,2,3,2,2,2,5,4,2};
//        final int i = new MajorityElementSort().majorityElement(array);
//        System.out.println(i);
//    }


    public int getIndex(int[] nums, int low, int high) {
        int tmp = nums[low];

        while (high > low) {

            while (high > low && nums[high] >= tmp) {
                high--;
            }

            nums[low] = nums[high];

            while (high > low && nums[low] <= tmp) {
                low++;
            }
            nums[high] = nums[low];

        }

        nums[low] = tmp;

        return low;
    }

    public void quickSort(int[] nums, int low, int high) {

        if (low < high) {

            int index = getIndex(nums, low, high);

            quickSort(nums, low, index -1);
            quickSort(nums, index + 1, high);

        }
    }


    public int majorityElement(int[] nums, int low, int high) {
        if (nums == null) {
            return 0;
        }


        int index = getIndex(nums, low, high);
        if (index == nums.length / 2 ) {
            return nums[index];
        }

        if (index > nums.length / 2) {
            return majorityElement(nums, low, index -1);
        } else {
            return majorityElement(nums, index + 1, high);
        }



    }

}
