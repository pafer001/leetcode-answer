package com.leetcode.answer.sort;

import java.util.Collections;
import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate {


    public static void main(String[] args) {

        int[] nums =  {-2147483648,2147483647};

        final boolean b = new ContainsNearbyAlmostDuplicate().containsNearbyAlmostDuplicate(nums, 1, 1);
        System.out.println(b);
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {


        for (int i = 0; i < nums.length; i++) {

            for (int j = Math.max(i - k, 0); j < i; j++) {
                if ( Math.abs((long)nums[i]- (long)nums[j]) <= t) {
                    return true;
                }

            }
        }

        return false;

    }


    public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }


}
