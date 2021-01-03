package com.leetcode.answer.stack;

import java.util.LinkedList;
import java.util.StringJoiner;

/**
 * 给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。
 *
 * 从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
 *
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinRemoveToMakeValid {

    public static void main(String[] args) {

        String s = "))((";
        final String s1 = minRemoveToMakeValid(s);
        System.out.println(s1);

    }
    public static String minRemoveToMakeValid(String s) {

        final char[] charArray = s.toCharArray();
        final LinkedList<String> stack = new LinkedList<>();

        int left = 0;
        for (char ch : charArray) {
            if (ch == ')') {
                if (left == 0) {
                    continue;
                } else {
                    stack.push(String.valueOf(ch));
                    left--;
                }
            } else if (ch == '(') {
                stack.push(String.valueOf(ch));
                left++;
            } else {
                stack.push(String.valueOf(ch));
            }

        }

        final StringBuffer buffer = new StringBuffer();
        while (!stack.isEmpty()) {
            final String pop = stack.pop();
            if (pop.equals("(") && left > 0) {
                left --;
                continue;
            }
            buffer.append(pop);
        }

        return buffer.reverse().toString();

    }


}
