package com.offer.answer._54;

import java.util.Stack;

public class kthLargest {

    public static void main(String[] args) {
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode4 = new TreeNode(4);
        final TreeNode treeNode2 = new TreeNode(2);

        treeNode3.left = treeNode1;
        treeNode3.right = treeNode4;
        treeNode1.right = treeNode2;


        final int i = new kthLargest().kthLargest1(treeNode3, 1);
        System.out.println(i);

    }
    int k ;
    int res;

    public int kthLargest1(TreeNode root, int k) {
        this.k = k;
        if (k ==0) {
            return 0;
        }
        dfs(root);

        return res;

    }

    public void dfs(TreeNode root) {

        if (root == null) {
            return;
        }
        dfs(root.right);
        if (--k == 0) {
            res = root.val;
//            System.out.println(root.val);
            return;
        }
        dfs(root.left);

    }

    public int kthLargest(TreeNode root, int k) {

        final Stack<TreeNode> treeStack = new Stack<>();
        TreeNode pNode = root;

        while (!treeStack.isEmpty() || pNode != null) {
            if (pNode != null) {
                treeStack.push(pNode);
                pNode = pNode.right;
            } else {
                k--;
                final TreeNode pop = treeStack.pop();
                if (k == 0) {
                    return pop.val;
                }
                pNode = pop.left;
            }

        }

        return -1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
