package com.test;


class TreeNode {
    int val;
   TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Depth {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        depth(root);
        return flag;
    }

    private int depth(TreeNode node) {

        if(node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        if( Math.abs(leftDepth-rightDepth) > 1 ) {
            flag =  false;
        }
        return Math.max(leftDepth, rightDepth) +1;

    }


    public static void main(String[] args) {

//        {1,2,3,4,5,#,#,#,#,6}

        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(1);
        final TreeNode treeNode3 = new TreeNode(1);
        final TreeNode treeNode4 = new TreeNode(1);
        final TreeNode treeNode5 = new TreeNode(1);
        final TreeNode treeNode6 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode5.right = treeNode6;


        final boolean b = new Depth().IsBalanced_Solution(treeNode1);
    }

}


