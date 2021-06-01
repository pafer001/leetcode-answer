package com.leetcode.answer.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SumNumbers {


    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node2.left = node3;
        node2.right = node4;


        final int sum = new SumNumbers().sumNumbers(node1);
        System.out.println(sum);
    }

    public int sumNumbers (TreeNode root) {

        if(root == null) {
            return 0;
        }
        ArrayDeque<TreeNode> queue =  new ArrayDeque<TreeNode>();
        queue.offer(root);
        List<Integer> resList = new ArrayList<>();
        int sum = 0;

        while(!queue.isEmpty()) {

            TreeNode node = queue.poll();
            if(node.left == null && node.right == null) {
                sum += node.val;
            } else {
                if(node.left != null) {
                    node.left.val = node.left.val + node.val * 10;
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    node.right.val = node.right.val + node.val * 10;
                    queue.offer(node.right);
                }
            }

        }

        return sum;
    }
}
