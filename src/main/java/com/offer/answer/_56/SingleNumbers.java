package com.offer.answer._56;

public class SingleNumbers {


    public static void main(String[] args) {

        int nums[] = {2, 4, 3, 6, 3, 2, 5, 5};
        final int[] array = new SingleNumbers().singleNumbers(nums);
        System.out.println(array);

    }

    public int[] singleNumbers(int[] nums) {

        int ret = 0;
        for (int num : nums) {
            ret = ret ^ num;
        }

        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }

        int a = 0, b = 0;

        for (int num : nums) {

            if ((num & div) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}
