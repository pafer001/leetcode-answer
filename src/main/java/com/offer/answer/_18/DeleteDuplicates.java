package com.offer.answer._18;

public class DeleteDuplicates {

    public static void main(String[] args) {

        final ListNode listNode1 = new ListNode(1);
        final ListNode listNode2 = new ListNode(1);
        final ListNode listNode3 = new ListNode(1);
        final ListNode listNode4 = new ListNode(1);
        final ListNode listNode5 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        final ListNode listNode = new DeleteDuplicates().deleteDuplicates(listNode1);
        System.out.println(listNode);

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pHead = head;
        ListNode qHead = head.next;

        if (qHead == null) {
            return head;
        }

        int count = 0;
        while (qHead != null) {

            if (pHead.val == qHead.val) {
                qHead = qHead.next;
                count++;
                continue;
            }

            if (pHead.val != qHead.val) {

                if (count <= 0) {
                    qHead = qHead.next;
                    pHead = pHead.next;
                    count = 0;
                    continue;
                }
                count = 0;

                pHead.next = qHead;

                qHead = qHead.next;
                pHead = pHead.next;

            }

        }

        if (count > 0) {
            pHead.next = qHead;

        }

        return head;

    }
}

