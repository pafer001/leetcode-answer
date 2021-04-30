package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class FindFirstCommonNode {

    public static void main(String[] args) {
//        {1,2,3},{4,5},{6,7}
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);


        node1.next = node2;
        node2.next = node3;
        node3.next = node6;

        node4.next = node5;
        node5.next = node6;

        node6.next = node7;

        final ListNode firstCommonNode = new FindFirstCommonNode().findFirstCommonNode(node1, node4);
        System.out.println(firstCommonNode);


    }


    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        int size1 = size(pHead1);
        int size2 = size(pHead2);

        ListNode pNode = pHead1;
        ListNode qNode = pHead2;

        int i =0;
        if(size1 > size2) {
            while(i < size1 - size2) {
                pNode = pNode.next;
                i++;
            }
        } else {
            while(i < size2 - size1) {
                qNode = qNode.next;
                i++;
            }
        }

        while(pNode != null && qNode != null) {
            if(qNode == pNode) {
                return qNode;
            }
            qNode = qNode.next;
            pNode = pNode.next;

        }

        return null;

    }

    public int size(ListNode pHead) {
        ListNode pNode = pHead;

        int size = 0;
        while(pNode != null) {
            pNode = pNode.next;
            size++;
        }
        return size;

    }
}
