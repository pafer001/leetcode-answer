package com.leetcode.answer.greedy;

public class CanJump {

    public static void main(String[] args) {
        int[] nums ={0};

        final boolean b = new CanJump().canJump(nums);
        System.out.println(b);
    }
    public boolean canJump(int[] nums) {

        int maxJumpLength = 0;

        for (int i=0; i< nums.length; i++) {

            if (i <= maxJumpLength) {
                maxJumpLength =  max(nums[i] + i, maxJumpLength);

                if (maxJumpLength >= nums.length-1 ) {
                    return true;
                }
            }

        }

        if (maxJumpLength >= nums.length-1 ) {
            return true;
        }

        return false;
    }

    private int max(int i, int j) {

        return i> j? i : j;
    }
}
