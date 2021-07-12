package com.leetcode.answer.tree;


import java.util.ArrayList;
import java.util.List;

public class ThreeOrders {

    public int[][] threeOrders (TreeNode root) {

        int[][] resArray = new int[3][];

        List<Integer> preList = new ArrayList<Integer>();
        preOrder(root, preList);

        List<Integer> inList = new ArrayList<Integer>();
        preOrder(root, inList);

        List<Integer> postList = new ArrayList<Integer>();
        postOrder(root, postList );

        for(int i=0; i< preList.size(); i++) {
            resArray[0][i] = preList.get(i);
            resArray[1][i] = inList.get(i);
            resArray[2][i] = postList.get(i);
        }
        return resArray;

    }

    void preOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return ;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);

    }

    void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return ;
        }
        preOrder(root.left, list);
        list.add(root.val);
        preOrder(root.right, list);

    }

    void postOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return ;
        }
        preOrder(root.left, list);
        preOrder(root.right, list);
        list.add(root.val);
    }



}
