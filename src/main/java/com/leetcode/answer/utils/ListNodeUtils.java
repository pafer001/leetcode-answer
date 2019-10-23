package com.leetcode.answer.utils;

import com.leetcode.answer.list.base.ListNode;

public class ListNodeUtils {


    public static void print(ListNode node) {

        while (node != null) {
            System.out.print(node.val + " ->");
            node = node.next;
        }
        System.out.println("null");
    }
}
