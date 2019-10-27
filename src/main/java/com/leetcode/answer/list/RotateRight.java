package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateRight {

    public static void main(String[] args) {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
//        ListNode _3 = new ListNode(3);
//        ListNode _4 = new ListNode(4);
//        ListNode _5 = new ListNode(5);
        _1.next=_2;
//        _2.next = _3;
//        _3.next = _4;
//        _4.next = _5;
        ListNode listNode = new RotateRight().rotateRight(_1, 2);
        System.out.println(listNode);

    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode pNode = head;
        ListNode qNode = head;

        int size = size(head);
        k = (size - k % size)% size;

        if (k == 0) {
            return head;
        }

        pNode = pNode.next;

        while (k > 1) {
            pNode = pNode.next;
            qNode = qNode.next;

            k--;
        }

        qNode.next = null;

        ListNode mNode = pNode;
        while (mNode.next != null) {
            mNode = mNode.next;
        }
        mNode.next = head;

        head = pNode;
        return head;
    }


    private int size(ListNode head) {

        if (head == null) {
            return 0;
        }

        int size = 0;

        ListNode p = head;
        while (p != null) {
            size++;
            p = p.next;
        }

        return size;

    }


}
