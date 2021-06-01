package com.leetcode.answer.str;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

public class IsValid {

    public boolean isValid(String s) {
        // write code here
        Stack<String> stack = new Stack<>();
        char[] chArray = s.toCharArray();
        for (char ch : chArray) {
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(String.valueOf(ch));
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                final String popElement = stack.pop();
                if ((popElement.equals("[") && ch == ']')
                        || (popElement.equals("(") && ch == ')')
                        || (popElement.equals("{") && ch == '}')) {

                    continue;
                }
                return false;
            }
        }
        List<String> objects = new ArrayList<>();

        return stack.isEmpty();
    }
}
