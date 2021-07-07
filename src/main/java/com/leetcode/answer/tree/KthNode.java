package com.leetcode.answer.tree;

import java.util.ArrayList;

public class KthNode {


    public static void main(String[] args) {
//        {5,3,7,2,4,6,8},3
        final TreeNode treeNode5 = new TreeNode(5);
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode7 = new TreeNode(7);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode4 = new TreeNode(4);
        final TreeNode treeNode6 = new TreeNode(6);
        final TreeNode treeNode8 = new TreeNode(8);

        treeNode5.left = treeNode3;
        treeNode5.right = treeNode7;

        treeNode3.left = treeNode2;
        treeNode3.right = treeNode4;

        treeNode7.left = treeNode6;
        treeNode7.right = treeNode8;

        final TreeNode treeNode = new KthNode().KthNode(treeNode5, 3);
        System.out.println(treeNode);

    }

    ArrayList<TreeNode> resNodes =  new ArrayList<TreeNode>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        if(k<=0 || pRoot == null) {
            return null;
        }

        if(resNodes.size() < k) {
            return null;
        }

        return resNodes.get(k -1);

    }



    public void addNode(TreeNode pRoot) {
        if(pRoot != null) {
            addNode(pRoot.left);
            resNodes.add(pRoot);
            addNode(pRoot.right);

        }

    }

}
