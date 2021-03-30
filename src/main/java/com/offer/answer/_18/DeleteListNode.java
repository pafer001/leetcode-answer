package com.offer.answer._18;

public class DeleteListNode {

    public static void main(String[] args) {

        final ListNode listNode1 = new ListNode(1);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(3);
        final ListNode listNode4 = new ListNode(4);
        final ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode3;
        listNode5.next = listNode4;
        final ListNode listNode = new DeleteListNode().deleteNode(listNode1, 3);
        System.out.println(listNode);

    }
    public ListNode deleteNode(ListNode head, int val) {


        ListNode pNode =  new  ListNode(-1);
        pNode.next = head;
        ListNode qNode =  head ;
        head = pNode;
        while (qNode != null) {

            if (qNode.val == val) {
                pNode.next = qNode.next;
            }

            pNode = pNode.next;
            qNode = qNode.next;
        }
        return head.next;
    }

}

  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
