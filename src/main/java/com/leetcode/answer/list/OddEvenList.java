package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 *
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 *
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 * 在真实的面试中遇到过这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OddEvenList {

    public static void main(String[] args) {
//        1->2->3->4->5->NUL
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
        ListNode _4 = new ListNode(4);
        ListNode _5 = new ListNode(5);
//        [1,2,3,4,5,6,7,8]
        ListNode _6 = new ListNode(6);
        ListNode _7 = new ListNode(7);
        ListNode _8 = new ListNode(8);

        _1.next=_2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;
        _5.next = _6;
        _6.next = _7;
        _7.next = _8;

        ListNode listNode = new OddEvenList().oddEvenList(_1);
        System.out.println(listNode);

    }

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        //奇数
        ListNode pNode = head;
        //偶数
        ListNode qNode = pNode.next;
        ListNode qHead = qNode;

        while (pNode.next != null && qNode.next != null) {
            pNode.next = pNode.next.next;
            pNode = pNode.next;
            qNode.next = qNode.next.next;
            qNode = qNode.next;

        }
        pNode.next = qHead;

        return qHead;

    }


}
