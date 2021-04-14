package com.test;

/*
//给定一个链表，删除链表的倒数第N个结点，并返回链表的头节点。
//示例：链表1->2->3->4->5，N=2；返回的链表为1->2->3->5
//考虑时间复杂度较优的实现，代码、注释完整，有测试用例。
 */
public class DeleteKNode {


    public static void main(String[] args) {
        final ListNode listNode = new DeleteKNode().testCommon();
        System.out.println(listNode);
        final ListNode listNode1 = new DeleteKNode().testMaxKNode();
        System.out.println(listNode1);

        final ListNode listNode2 = new DeleteKNode().testListLengthNode();
        System.out.println(listNode2);

        final ListNode listNode3 = new DeleteKNode().testDeleteNullNode();
        System.out.println(listNode3);

        final ListNode listNode4 = new DeleteKNode().testKError();
        System.out.println(listNode4);
    }
    //测试k不满足
    public ListNode testKError() {
        final ListNode listNode = mockNode();

        return deleteKNode(listNode, -1);
    }

    //测试空list
    public ListNode testDeleteNullNode() {
        return deleteKNode(null, 5);
    }

    //测试k==list.lengrh
    public ListNode testListLengthNode() {
        final ListNode listNode = mockNode();
        return deleteKNode(listNode, 5);
    }

    //测试k<list.lengrh

    public ListNode testCommon() {
        final ListNode listNode = mockNode();
        return deleteKNode(listNode, 2);
    }

    //mock数据
    public ListNode testMaxKNode() {
        final ListNode listNode = mockNode();
        return deleteKNode(listNode, 10);
    }

    public ListNode mockNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }


    public ListNode deleteKNode(ListNode node, int k) {

        if (k < 0 || node == null) {
            return node;
        }

        ListNode fastNode = node;
        ListNode slowNode = node;


        while (k > 0 && fastNode.next != null) {
            fastNode = fastNode.next;
            k--;
        }

        if (k == 1) {
            node = node.next;
        } else if (k==0){
            while (fastNode.next != null) {
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }

            slowNode.next = slowNode.next.next;
        }


        return node;
    }
}

class ListNode {

    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}
