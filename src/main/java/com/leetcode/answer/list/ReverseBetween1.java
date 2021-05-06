package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class ReverseBetween1 {


    public static void main(String[] args) {
//
//        final ListNode listNode = new ListNode(5);
//
//        final ListNode listNode1 = new ReverseBetween1().reverseBetween(listNode, 1, 1);
//        System.out.println(listNode1);

        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        node1.next = node2;
//        node2.next = node3;


        final ListNode reverse = new ReverseBetween1().reverseBetween(node1, 1, 1);
        System.out.println(reverse);
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        final ListNode emptyNode = new ListNode(0);
        emptyNode.next = head;

        ListNode pre = emptyNode;

        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode rightNode = pre;
        for (int i = 0; i <  n - m + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        pre.next = null;
        rightNode.next = null;


        reverse(leftNode);

        pre.next = rightNode;
        leftNode.next = curr;

        return emptyNode.next;
    }


    public ListNode reverse(ListNode node) {

        final ListNode emptyNode = new ListNode(0);
        emptyNode.next = node;

        ListNode nextNode = node.next;
        node.next = null;

        while (nextNode != null) {

            ListNode pNode = nextNode;
            nextNode = nextNode.next;


            pNode.next = emptyNode.next;
            emptyNode.next = pNode;

        }

        return emptyNode.next;
    }
}
