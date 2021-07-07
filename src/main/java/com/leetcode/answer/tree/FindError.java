package com.leetcode.answer.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class FindError {

    public static void main(String[] args) {
//        {1,2,3}
        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        final int[] error = new FindError().findError(treeNode1);
        System.out.println(error);
    }

    ArrayList<Integer> nodeVals =  new ArrayList<Integer>();
    public int[] findError (TreeNode root) {

        int result[] = new int[2];
        inOrderTree(root);

        int[] array = new int[2];
        int i =0;
        for( i = 0; i < nodeVals.size() - 1; i++) {
            if(nodeVals.get(i) > nodeVals.get(i + 1)) {
                result[1] = nodeVals.get(i);
                break;
            }
        }
        for(int j = nodeVals.size() - 1; j > i; j--) {
            if(nodeVals.get(j) < nodeVals.get(j - 1)) {
                result[0] = nodeVals.get(j);
                break;
            }
        }

        return array;


    }


    void inOrderTree(TreeNode node) {

        if(node == null) {
            return;
        }
        inOrderTree(node.left);
        nodeVals.add(node.val);
        inOrderTree(node.right);

    }
}
