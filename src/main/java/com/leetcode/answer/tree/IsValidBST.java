package com.leetcode.answer.tree;

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {

        if (root == null ) {
            return true;
        }

        boolean leftResult = true;
        boolean rightResult = true;

        if (root.left != null) {
            if (root.val <= root.left.val) {
                System.out.println("-left--" + root.val );
                return false;
            }
            leftResult = isValidBST(root.left);
        }

        if (root.right != null) {
            if (root.val >= root.right.val) {
                System.out.println("-right--" + root.val );

                return false;
            }
            rightResult = isValidBST(root.right);
        }

        return leftResult && rightResult;

    }

    public static void main(String[] args) {

        final TreeNode treeNode5 = new TreeNode(5);
        final TreeNode treeNode4 = new TreeNode(4);
        final TreeNode treeNode6 = new TreeNode(6);
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode7 = new TreeNode(7);
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode6;
        treeNode6.left = treeNode3;
        treeNode6.right = treeNode7;

        final boolean validBST = new IsValidBST().isValidBST(treeNode5);
        System.out.println(validBST);


    }
}
