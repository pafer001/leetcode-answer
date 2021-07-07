package com.leetcode.answer.tree;

import java.util.ArrayDeque;

public class MaxPathSum {

    public static void main(String[] args) {
//        {1,2,3}

        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        final int max = new MaxPathSum().maxPathSum(treeNode1);
        System.out.println(max);

    }

    public int maxPathSum (TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);

        ArrayDeque<Integer> pathSumQueue = new ArrayDeque<Integer>();
        pathSumQueue.offer(0);

        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty()) {

            TreeNode node = queue.poll();
            int lastSum = pathSumQueue.poll();
            int tmpSum = lastSum + node.val;

            if(lastSum <0) {
                if(max < node.val) {
                    max =  node.val;
                }
            } else if(max < tmpSum) {
                max = tmpSum;
            }

            if(node.left != null) {
                queue.offer(node.left);
                pathSumQueue.offer(tmpSum);
            }


            if(node.right != null) {
                queue.offer(node.right);
                pathSumQueue.offer(tmpSum);
            }
        }



        return max;
    }
}
