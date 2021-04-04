package com.offer.answer._30;

import java.util.Stack;

public class MinStack {


    public static void main(String[] args) {
//        ["MinStack","push","push","push","push","pop","min","pop","min","pop","min"]
//[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]

        final MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(-512);

        System.out.println(minStack.min());

    }

    Stack<Integer> aStack = null;
    Stack<Integer> bStack = null;

    public MinStack() {
        aStack = new Stack();
        bStack = new Stack();
    }

    public void push(int x) {
//        aStack.add(x);
        aStack.push(x);
        if (bStack.isEmpty() || x <= bStack.peek()) {
            bStack.push(x);
        }
    }

    public void pop() {

//        final Integer pop = aStack.pop();
        if (aStack.pop().equals(bStack.peek())) {
            bStack.pop();
        }
    }

    public int top() {
        return aStack.peek();
    }

    public int min() {
        return bStack.peek();
    }
}
