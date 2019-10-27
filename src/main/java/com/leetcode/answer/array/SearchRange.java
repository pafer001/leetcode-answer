package com.leetcode.answer.array;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SearchRange {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] ints = new SearchRange().searchRange(nums, 8);
        System.out.println(ints);

        int[] ints1 = new SearchRange().searchRange(nums, 6);
        System.out.println(ints1);

        int[] nums2 = {};
        int[] ints12 = new SearchRange().searchRange(nums2, 6);
        System.out.println(ints12);

    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        if (nums == null || nums.length == 0) {
            return res;
        }

        boolean firstTarget = true;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                if (firstTarget) {
                    firstTarget = false;
                    res[0] = i;
                    res[1] = i;

                }
                res[1] = i;

            }
        }

        return res;
    }
}
