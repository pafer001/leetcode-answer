package com.offer.answer._25;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(-1);
        ListNode curr = head;


        while (l1 != null && l1 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if (l1!= null) {
            curr.next = l1;
        }
        if (l2!= null) {
            curr.next = l2;
        }

        return head.next;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
