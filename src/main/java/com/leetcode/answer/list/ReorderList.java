package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        node3.next = node1;
        node1.next = node2;

        new ReorderList().reorderList(node1);
        System.out.println(node1);

    }


    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode pNode = head.next;

        int count = 0;
        while (pNode != null) {
            stack.push(pNode);
            pNode = pNode.next;
            count++;
        }

        ListNode qNode = head;
        pNode = stack.pop();

        int index = 0;
        while (!stack.isEmpty() && index <= count / 2) {
            qNode.next = pNode.next;
            pNode.next = qNode;

            qNode = qNode.next;
            pNode = stack.pop();
            index++;
        }


    }

}
