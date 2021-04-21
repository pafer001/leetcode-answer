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

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);

    }

    public static void main(String[] args) {

        final TreeNode treeNode5 = new TreeNode(2147483647);
//        final TreeNode treeNode4 = new TreeNode(4);
//        final TreeNode treeNode6 = new TreeNode(6);
//        final TreeNode treeNode3 = new TreeNode(3);
//        final TreeNode treeNode7 = new TreeNode(7);
//        treeNode5.left = treeNode4;
//        treeNode5.right = treeNode6;
//        treeNode6.left = treeNode3;
//        treeNode6.right = treeNode7;

        final boolean validBST = new IsValidBST().isValidBST(treeNode5);
        System.out.println(validBST);


    }
}
