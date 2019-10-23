package com.leetcode.answer.list;

import com.leetcode.answer.list.base.ListNode;
import com.leetcode.answer.utils.ListNodeUtils;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {
//        1->2->3->null
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
//        ListNode _4 = new ListNode(4);
//        ListNode _5 = new ListNode(5);

        _1.next=_2;
        _2.next = _3;
//        _3.next = _4;
//        _4.next = _5;
        ListNode listNode = new RemoveNthFromEnd().removeNthFromEnd(_1, 1);
        ListNodeUtils.print(listNode);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        ListNode pNode = head;
        while (n >= 1 && pNode != null) {

            pNode = pNode.next;
            n--;
        }
        if (pNode == null) {
            return head.next;
        }


        ListNode mNode = head;

        while (pNode.next != null) {

            pNode = pNode.next;
            mNode = mNode.next;
        }


        mNode.next = mNode.next.next;

        return head;

    }
}
