package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class FindKthToTail {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

//        ListNode node3 = new ListNode(3);
//        node3.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        final ListNode listNode = new FindKthToTail().FindKthToTail(node1, 2);
        System.out.println(listNode);

    }
    public ListNode FindKthToTail (ListNode pHead, int k) {

        if(pHead == null || k ==0) {
            return null;
        }
        ListNode node = new ListNode(-1);
        node.next = pHead;

        ListNode firstNode = node;

        while(firstNode != null && k > 0) {
            firstNode = firstNode.next;
            k--;
        }

        if (k < 0) {
            return  null;
        }

        ListNode secondNode = node;
        while (firstNode.next != null) {
            secondNode = secondNode.next;
            firstNode = firstNode.next;

        }

        return firstNode;


    }
}
