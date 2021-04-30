package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class DeleteDuplicates {


    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
//        ListNode head2 = new ListNode(2);
//        ListNode head3 = new ListNode(2);
//        head1.next = head2;
//        head2.next = head3;

        final ListNode listNode = new DeleteDuplicates().deleteDuplicates(head1);
        System.out.println(listNode);
    }
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null) {
            return null;
        }
        ListNode node = new ListNode(-1);
        ListNode pnode = node;

        node.next = head;
        ListNode node1 = head;

        while(node1 != null) {

            while(node1.next != null && node1.val == node1.next.val) {
                node1 = node1.next;
            }
            if (node.next != node1) {
                node.next = node1.next;
            }

            while(node.next == node1) {
                node = node.next;
            }
            if(node1 != null) {
                node1 = node1.next;

            }
        }

        return pnode.next;



    }
}
