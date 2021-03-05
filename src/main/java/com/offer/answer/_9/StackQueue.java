package com.offer.answer._9;

import java.util.Stack;

public class StackQueue {
    final Stack<Integer> stack1 = new Stack<>();
    final Stack<Integer> stack2 = new Stack<>();

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {

        if (stack2.empty()) {
            while (!stack1.empty()) {
                final Integer pop = stack1.pop();
                stack2.push(pop);
            }
        }
        if (stack2.empty()) {
            return -1;
        }
        return stack2.pop();

    }

    public static void main(String[] args) {
        StackQueue obj = new StackQueue();
        obj.appendTail(3);
        int param_2 = obj.deleteHead();
        int param_3 = obj.deleteHead();
        int param_4 = obj.deleteHead();
        System.out.println(param_4);

    }
}
