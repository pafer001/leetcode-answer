package com.offer.answer._59;

import java.util.*;

public class MaxQueue1 {

    public static void main(String[] args) {
        MaxQueue1 obj = new MaxQueue1();
        obj.push_back(3);
        obj.push_back(2);
        obj.push_back(5);
        obj.push_back(7);
        obj.push_back(4);

        System.out.println(obj);
    }

    Queue<Integer> q;
    Deque<Integer> d;

    public MaxQueue1() {
        q = new LinkedList<Integer>();
        d = new LinkedList<Integer>();
    }

    public int max_value() {
        if (d.isEmpty()) {
            return -1;
        }
        return d.peekFirst();
    }

    public void push_back(int value) {
        while (!d.isEmpty() && d.peekLast() < value) {
            d.pollLast();
        }
        d.offerLast(value);
        q.offer(value);
    }

    public int pop_front() {
        if (q.isEmpty()) {
            return -1;
        }
        int ans = q.poll();
        if (ans == d.peekFirst()) {
            d.pollFirst();
        }
        return ans;
    }


}
