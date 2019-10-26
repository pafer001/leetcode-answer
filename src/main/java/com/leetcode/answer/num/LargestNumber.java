package com.leetcode.answer.num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 * 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }

        List<Object> numList = new ArrayList<>();
        boolean allZero = true;
        for (int num : nums) {
            numList.add(num);
            if (allZero && num != 0) {
                allZero = false;
            }
        }
        if (allZero) {
            return "0";
        }

        return numList.stream().map(String::valueOf).sorted(new Comparator<String>() {
            @Override
            public int compare(String num1, String num2) {
                char[] numArray1 = (num1+num2).toCharArray();
                char[] numArray2 = (num2+num1).toCharArray();
                int i = 0, j = 0;

                while (i< numArray1.length && j < numArray2.length) {

                    if (numArray1[i] != numArray2[j]) {
                         return numArray2[j] - numArray1[i];
                    }
                    i++;
                    j++;
                }

                if (i <  numArray1.length) {
                    if (i == numArray1.length -1 && numArray1[i] == '0') {
                        return 1;
                    }
                    return -1;
                }

                if (j <  numArray2.length) {
                    if (j == numArray2.length -1 && numArray2[j] == '0') {
                        return -1;
                    }
                    return 1;
                }


                return 0;
            }
        }).collect(Collectors.joining());
    }



    public static void main(String[] args) {
//
//        int[] array ={10, 2};
//
//        String s = new LargestNumber().largestNumber(array);
//        System.out.println(s);
//        3,30,34,5,9
        int[] array1 = { 3,30,34,5,9};
        int[] array12 = {121,12};
        int[] array123 = {0,0};

        String s1 = new LargestNumber().largestNumber(array123);
        System.out.println(s1);
    }
}
