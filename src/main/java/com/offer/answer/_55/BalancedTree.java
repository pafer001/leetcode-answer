package com.offer.answer._55;

public class BalancedTree {

    public boolean isBalanced(TreeNode root) {

        return maxDepth(root) != -1;

    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        final int leftVal = maxDepth(root.left);
        if (leftVal == -1) {
            return -1;
        }
        final int rightVal = maxDepth(root.right);
        if (rightVal == -1) {
            return -1;
        }
        return Math.abs(leftVal - rightVal) < 2 ? Math.max(leftVal, rightVal) + 1 : -1;
    }


}
