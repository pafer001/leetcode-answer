package com.offer.answer._28;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SymmetricTree {

    public static void main(String[] args) {
//        [1,2,2,3,4,4,3]

        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(2);
        final TreeNode treeNode4 = new TreeNode(3);
        final TreeNode treeNode5 = new TreeNode(4);
        final TreeNode treeNode6 = new TreeNode(4);
        final TreeNode treeNode7 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        final boolean symmetric = new SymmetricTree().isSymmetric(treeNode1);
        System.out.println(symmetric);
    }


    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isCoreSymmetric(root.left, root.right);
    }

    public boolean isCoreSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isCoreSymmetric(left.left, right.right) && isCoreSymmetric( left.right, right.left);

    }
}
