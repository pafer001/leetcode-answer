package com.leetcode.answer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ThreeOrders1 {

    public int[][] threeOrders(TreeNode root) {



        List<Integer> preList = new ArrayList<Integer>();
        preOrder(root, preList);

        List<Integer> inList = new ArrayList<Integer>();
        inOrder(root, inList);

        List<Integer> postList = new ArrayList<Integer>();
        postOrder(root, postList);
        int[][] resArray = new int[3][preList.size()];

        for (int i = 0; i < preList.size(); i++) {
            resArray[0][i] = preList.get(i);
            resArray[1][i] = inList.get(i);
            resArray[2][i] = postList.get(i);
        }
        return resArray;

    }

    void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

    }

    void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;


        }


    }


    void postOrder(TreeNode root, List<Integer> list) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(0, curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

    }


}
