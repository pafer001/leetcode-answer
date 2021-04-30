package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class SortInList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node3.next = node1;
        node1.next = node2;

        final ListNode listNode = new SortInList().sortInList(node3);
        System.out.println(listNode);

    }
    public ListNode sortInList (ListNode head) {
        // write code here
        if(head.next == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;

        while(node.next != null) {
            ListNode pNode = node;

            ListNode qNode = pNode.next;

            while(qNode.next != null) {

                if(qNode.next.val < pNode.next.val) {

                    ListNode node1 =  qNode.next;
                    ListNode node2 =  pNode.next;

                    node1.next = pNode.next.next;
                    pNode.next = node1;

                    node2.next =  qNode.next.next;
                    qNode.next = node2;

                }
                qNode = qNode.next;
            }

            node = node.next;
        }


        return node.next;

    }
}
