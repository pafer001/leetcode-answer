package com.offer.answer._52;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB) {

            nodeA = nodeA == null? headB : nodeA.next;
            nodeB = nodeB == null? headA : nodeB.next;

        }
        return nodeA;
    }
}
