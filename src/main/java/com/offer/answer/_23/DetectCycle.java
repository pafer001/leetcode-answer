package com.offer.answer._23;




public class DetectCycle {

    public static void main(String[] args) {

        final ListNode listNode1 = new ListNode(3);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(0);
        final ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        final ListNode listNode = new DetectCycle().detectCycle(listNode1);
        System.out.println(listNode);
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode pNode = head;

                while (pNode != slow ) {
                    slow = slow.next;
                    pNode = pNode.next;

                }
                return pNode;
            }
        }
        return null;
    }

   static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
