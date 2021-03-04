package com.offer.answer._6;

public class ReverseList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        final ListNode node = new ReverseList().reverseList(node1);
        System.out.println(node);

    }
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode pNode = head.next;

        head.next = null;

        while (pNode != null) {
            ListNode qNode = pNode;
            pNode = pNode.next;

            qNode.next =  head;
            head = qNode;
        }

        return head;

    }
}
