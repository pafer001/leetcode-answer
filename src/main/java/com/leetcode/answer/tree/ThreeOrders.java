package com.leetcode.answer.tree;


import java.util.ArrayList;
import java.util.List;

public class ThreeOrders {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node2.left = node3;
        node2.right = node4;

//        List<Integer> list = new ArrayList<>();
//        new ThreeOrders().inOrder(node1, list);
//        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        new ThreeOrders().postOrder(node1, list1);
        System.out.println(list1);

    }

    public int[][] threeOrders (TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);

        List<Integer> inOrderList = new ArrayList<>();
        inOrder(root, inOrderList);

        List<Integer> postOrderList = new ArrayList<>();
        postOrder(root, postOrderList);

        int[][]  resArray = new int[3][preOrderList.size()];
        for (int i=0;i<preOrderList.size(); i++) {
            resArray[0][i] = preOrderList.get(i);
            resArray[1][i] = inOrderList.get(i);
            resArray[2][i] = postOrderList.get(i);
        }

        return resArray;
    }


    void preOrder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return ;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);

    }

    void inOrder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return ;
        }
        inOrder(root.left, list);
        list.add( root.val);
        inOrder(root.right, list);
    }

    void postOrder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return ;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
