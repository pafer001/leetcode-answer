package com.leetcode.answer.dump;

/**
 * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 * <p>
 * 示例：
 * <p>
 * 输入： arr = [1,3,5,7,2,4,6,8], k = 4
 * 输出： [1,2,3,4]
 * 提示：
 * <p>
 * 0 <= len(arr) <= 100000
 * 0 <= k <= min(100000, len(arr))
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-k-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SmallestK {

    public static void main(String[] args) {

        int[] array = {3, 2, 1, 5, 6, 4};
        final int[] resArray = new SmallestK().smallestK(array, 2);
        System.out.println(resArray);
    }

    public int[] smallestK(int[] array, int k) {
        buildHeap(array);

        int[] resArray = new int[k];
        int length = array.length;
        for (int i = 0; i < k; i++) {

            resArray[i] = array[0];
            swap(array, length - 1, 0);
            length --;
            smallestAdjust(array, 0, length);
//            k--;
        }
        return resArray;
    }

    private void buildHeap(int[] array) {

        for (int i = array.length; i >= 0; i--) {
            smallestAdjust(array, i, array.length);
        }
    }

    private void smallestAdjust(int[] array, int i, int length) {

        int smallestIndex = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && array[left] < array[smallestIndex]) {

            smallestIndex = left;
        }

        if (right < length && array[right] < array[smallestIndex]) {

            smallestIndex = right;
        }

        if (smallestIndex != i) {

            swap(array, smallestIndex, i);
            smallestAdjust(array, smallestIndex, length);
        }


    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }
}
