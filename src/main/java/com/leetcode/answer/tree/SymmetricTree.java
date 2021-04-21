package com.leetcode.answer.tree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2== null) {
            return true;
        } else if (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                return false;
            }
            return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
        } else {
            return false;
        }
    }
}
