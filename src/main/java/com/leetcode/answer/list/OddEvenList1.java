package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

public class OddEvenList1 {

    public static void main(String[] args) {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
        ListNode _4 = new ListNode(4);
        ListNode _5 = new ListNode(5);
//        [1,2,3,4,5,6,7,8]
        ListNode _6 = new ListNode(6);


        _1.next=_2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;
        _5.next = _6;


        ListNode listNode = new OddEvenList1().oddEvenList(_1);
        System.out.println(listNode);

    }

    public ListNode oddEvenList (ListNode head) {
        // write code here
        ListNode oddNode = new ListNode(-1);
        ListNode evenNode = new ListNode(-1);

        int index = 1;
        ListNode tailOddNode = oddNode;
        ListNode tailEvenNode = evenNode;
        while (head != null) {

            ListNode pNode = head;
            head = head.next;
            pNode.next = null;

            if (index % 2 == 1) {
                tailOddNode.next = pNode;
                tailOddNode = tailOddNode.next;
            } else {
                tailEvenNode.next = pNode;
                tailEvenNode = tailEvenNode.next;

            }
            index++;
        }

        tailOddNode.next = evenNode.next;
        return oddNode.next;
    }
}
