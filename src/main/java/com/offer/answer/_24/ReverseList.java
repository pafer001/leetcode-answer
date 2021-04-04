package com.offer.answer._24;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pHead = new ListNode(-1);
        pHead.next = head;


        ListNode curr = head.next;

        head.next = null;

        while (curr != null) {
            ListNode qNode = curr.next;

            curr.next = pHead.next;
            pHead.next = curr;
            curr = qNode;
        }
        return pHead.next;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
