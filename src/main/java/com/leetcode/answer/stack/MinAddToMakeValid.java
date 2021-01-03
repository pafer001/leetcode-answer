package com.leetcode.answer.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。
 * <p>
 * 从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
 * <p>
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinAddToMakeValid {

    public int minAddToMakeValid(String S) {


        final LinkedList<String> stack = new LinkedList<>();
        final char[] charArray = S.toCharArray();

        int count = 0;
        for (char ch : charArray) {
            final String e = String.valueOf(ch);
            if (e.equals("(")) {
                stack.push(e);
            }

            if (e.equals(")")) {
                if (stack.size() != 0) {
                    stack.pop();
                } else {
                    count++;
                }

            }
        }

        return count + stack.size();

    }
}
