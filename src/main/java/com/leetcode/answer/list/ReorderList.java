package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node3.next = node1;
        node1.next = node2;

         new ReorderList().reorderList(node3);
        System.out.println(node3);

    }


    public void reorderList(ListNode head) {


         Stack<ListNode> stack = new Stack<ListNode>();

        ListNode pNode = head.next;

        int count =0;
        while(pNode != null) {
            stack.push(pNode);
            pNode = pNode.next;
            count++;
        }

        ListNode qNode = head;
        pNode = stack.pop();

        int index =0;
        while (index <= count/2) {
            qNode.next = pNode.next;
            pNode.next= qNode;

            qNode = qNode.next;
            pNode = stack.pop();
            index++;
        }


    }

}
