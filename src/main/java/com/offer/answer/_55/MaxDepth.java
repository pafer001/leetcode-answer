package com.offer.answer._55;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;
import java.util.List;

public class MaxDepth {

    public static void main(String[] args) {
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode4 = new TreeNode(4);
        final TreeNode treeNode2 = new TreeNode(2);

        treeNode3.left = treeNode1;
        treeNode3.right = treeNode4;
        treeNode1.right = treeNode2;


        final int i = new MaxDepth().maxDepth1(treeNode3);
        System.out.println(i);

    }
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<TreeNode> queue1 = new LinkedList<>();

        int depth = 0;

        while (!queue.isEmpty()) {

            final TreeNode removeNode = queue.remove(0);

            if (removeNode.left != null) {
                queue1.add(removeNode.left);
            }

            if (removeNode.right != null) {
                queue1.add(removeNode.right);
            }
            if (queue.isEmpty()) {
                depth++;
                queue = queue1;
                queue1 = new LinkedList<>();
            }

        }

        return depth;

    }

    public int maxDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int mLeft = maxDepth1(root.left);
        int mRight = maxDepth1(root.right);

        return mLeft> mRight ? (mLeft +1) : (mRight +1);

    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }