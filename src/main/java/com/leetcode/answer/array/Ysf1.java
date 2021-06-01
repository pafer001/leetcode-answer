package com.leetcode.answer.array;

import com.leetcode.answer.list.base.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Ysf1 {

    public static void main(String[] args) {

        final int ysf = new Ysf1().ysf1(5, 2);
        System.out.println(ysf);
    }

    public int ysf(int n, int m) {

        ListNode node = createNode(n);

        int i = 1;
        while (node.next != node) {

            if (i == m - 1) {
                node.next.next = node;
                i = 1;
                continue;
            }

            node = node.next;
            i++;

        }
        return node.val;

    }

    private ListNode createNode(int n) {
        ListNode head = new ListNode(1);
        ListNode tail = head;

        for (int i = 2; i <= n; i++) {
            final ListNode listNode = new ListNode(i);
            tail.next = listNode;
            tail = listNode;
        }

        tail.next = head;
        return head;
    }
    public int ysf1(int n, int m) {

        List<Integer> list = new ArrayList<>();
        for (int i=1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() != 1) {

             index = (index + m -1) % list.size();
             list.remove(index);
        }
        return list.get(0);

    }

}
