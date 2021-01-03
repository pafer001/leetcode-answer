//package com.leetcode.answer.list;
//
//import com.leetcode.answer.list.base.ListNode;
//
///**
// * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
// *
// * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
// *
// *  
// *
// * 示例:
// *
// * 给定 1->2->3->4, 你应该返回 2->1->4->3.
// *
// * 来源：力扣（LeetCode）
// * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
// * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
// */
//public class SwapPairs {
//
//    public ListNode swapPairs(ListNode head) {
//
//        if (head == null) {
//            return head;
//        }
//
//        ListNode p1 = head;
//        ListNode p2 = head.next;
//
//        if (p2 == null) {
//            return head;
//        }
//
//        ListNode p3 = p1;
//        ListNode p4 = p2;
//
//
//        while (p4 != null) {
//            p3 = p4.next;
//
//        }
//
//
//    }
//}
