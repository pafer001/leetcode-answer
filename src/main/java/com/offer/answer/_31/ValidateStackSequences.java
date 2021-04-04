package com.offer.answer._31;

import java.util.Stack;

public class ValidateStackSequences {

    final Stack<Integer> stack = new Stack<Integer>();

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int  popIndex = 0;


        for (int num : pushed) {
            stack.push(num);

            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }


        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        final boolean b = new ValidateStackSequences().validateStackSequences(pushed, popped);
        System.out.println(b);
    }
}
