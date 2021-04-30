package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

import java.util.Stack;

public class AddInList {

    public static void main(String[] args) {

        ListNode head9 = new ListNode(9);
        ListNode head3 = new ListNode(3);
        ListNode head7 = new ListNode(7);
        head9.next = head3;
        head3.next = head7;

        ListNode head61 = new ListNode(6);
        ListNode head31 = new ListNode(3);
        head61.next = head31;

        final ListNode listNode = new AddInList().addInList(head9, head61);
        System.out.println(listNode);

    }

    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        Stack<Integer> stack1 =  putNodeInStack(head1);
        Stack<Integer> stack2 =  putNodeInStack(head2);
        ListNode node = null;

        int falg = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()) {

            int sum =   (stack1.isEmpty() ? 0 : stack1.pop())
                    + (stack2.isEmpty()  ? 0 : stack2.pop())
                    + falg;
            ListNode node1 =   new ListNode(sum % 10);
//             node1.val = ;

            node1.next = node;
            node = node1;

            falg = sum / 10;
        }

        if(falg !=0) {
            ListNode node1 =   new ListNode(falg);
//            node1.val = falg;
            node1.next = node;
            node = node1;
        }

        return node;


    }

    public Stack<Integer> putNodeInStack(ListNode node) {
        Stack<Integer> stack1 =  new Stack<Integer>();
        while(node != null) {
            stack1.push(node.val);
            node = node.next;
        }
        return stack1;

    }
}
