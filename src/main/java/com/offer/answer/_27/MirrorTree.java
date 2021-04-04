package com.offer.answer._27;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        final TreeNode leftRoot = root.left;
        root.left = root.right;
        root.right = leftRoot;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }

    public TreeNode mirrorTree1(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree1(root.right);
        root.right = mirrorTree1(tmp);
        return root;
    }




    public static void main(String[] args) {
        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode2;


        final TreeNode treeNode = new MirrorTree().mirrorTree(treeNode1);
        System.out.println(treeNode);

    }


}
