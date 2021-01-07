package com.leetcode.answer.dump;

/*

在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

示例 1:

输入: [3,2,1,5,6,4] 和 k = 2
输出: 5
示例 2:

输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4
说明:

你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class FindKthLargest {

    public int findKthLargest(int[] array, int k) {
        buildHeap(array);
        int length = array.length;

        while (k > 1) {
            swap(array, length - 1, 0);
            length--;

            maxAdjust(array, 0, length);
            k--;
        }
        return array[0];
    }

    public void buildHeap(int[] array) {

        for (int i = array.length / 2; i >= 0; i--) {
            maxAdjust(array, i, array.length);
        }
    }

    public void maxAdjust(int[] array, int i, int length) {

        int maxIndex = i;

        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < length &&   array[l] > array[maxIndex]) {
            maxIndex = l;
        }

        if (r < length &&  array[r] > array[maxIndex]) {
            maxIndex = r;
        }

        if (maxIndex != i) {
            swap(array, maxIndex, i);
            maxAdjust(array, maxIndex, length);

        }
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }

    public static void main(String[] args) {

        int[] array = {3, 2, 1, 5, 6, 4};
        final int kthLargest = new FindKthLargest().findKthLargest(array, 2);
        System.out.println(kthLargest);
    }
}
