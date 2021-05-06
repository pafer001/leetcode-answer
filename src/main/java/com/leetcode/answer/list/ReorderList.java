package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        node3.next = node1;
        node1.next = node2;

        new ReorderList().reorderList(node1);
        System.out.println(node1);

    }


    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> nodeList = new ArrayList<>();
        ListNode pNode = head;

        while (pNode != null) {
            nodeList.add(pNode);
            pNode = pNode.next;
        }

        int left = 0;
        int right = nodeList.size() - 1;

        while (right > left) {
            nodeList.get(left).next = nodeList.get(right);
            left++;

            if (left == right) {
                break;
            }
            nodeList.get(right).next = nodeList.get(left);
            right--;

        }

        nodeList.get(left).next = null;

    }

}
