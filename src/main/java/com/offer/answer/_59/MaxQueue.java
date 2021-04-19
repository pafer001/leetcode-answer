package com.offer.answer._59;


import java.util.*;

class MaxQueue {

    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        obj.push_back(3);
        obj.push_back(2);
        obj.push_back(5);
        obj.push_back(7);
        obj.push_back(4);



        System.out.println(obj);
    }

    Deque<Integer> maxQueue = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();

    public MaxQueue() {


    }

    public int max_value() {

        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.peekFirst();
    }

    public void push_back(int value) {


        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.offerLast(value);
        queue.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }

        final Integer remove = queue.poll();
        if (remove == max_value()) {
            maxQueue.removeFirst();
        }
        return remove;

    }
}


