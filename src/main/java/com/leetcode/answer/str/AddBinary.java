package com.leetcode.answer.str;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddBinary {

    public static void main(String[] args) {

        System.out.println(new AddBinary().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {

        StringBuilder builder = new StringBuilder();


        int tmp = 0;
        int i = a.length() -1, j = b.length() -1;
        while (i >= 0 && j >= 0) {
            char ac = a.charAt(i);
            char bc = b.charAt(j);
            int sum = Integer.parseInt(String.valueOf(ac)) + Integer.parseInt(String.valueOf(bc)) + tmp;
            builder.append(sum % 2);
            tmp = sum / 2;
            i--;
            j--;
        }

        while (i >= 0)  {
            char ac = a.charAt(i);
            int sum = Integer.parseInt(String.valueOf(ac))  + tmp;
            builder.append(sum % 2);
            tmp = sum / 2;
            i--;

        }

        while (j >= 0)  {
            char bc = b.charAt(j);
            int sum = Integer.parseInt(String.valueOf(bc))  + tmp;
            builder.append(sum % 2);
            tmp = sum / 2;
            j--;
        }

        if (tmp != 0) {
            builder.append(tmp);
        }

        return builder.reverse().toString();
    }
}
