package com.offer.answer._21;

public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode pNode = head;
        while (k > 0 && pNode != null) {
            pNode = pNode.next;
            k--;
        }

        while (pNode != null) {
            pNode = pNode.next;
            head = head.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
