package com.offer.answer._32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LevelTreeOrder2 {

    public static void main(String[] args) {


        final TreeNode node3 = new TreeNode(3);
        final TreeNode node9 = new TreeNode(9);
        final TreeNode node20 = new TreeNode(20);
        final TreeNode node15 = new TreeNode(15);
        final TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;

        final List<List<Integer>> lists = new LevelTreeOrder2().levelOrder(node3);
        System.out.println(lists);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Stack<TreeNode> curStack = new Stack<>();
        Stack<TreeNode> nextStack = new Stack<>();

        curStack.add(root);
        List<List<Integer>> returnList = new ArrayList<>();

        List<Integer> tmpList = new ArrayList<>();
        int flag =0;
        while (!curStack.isEmpty()) {
            final TreeNode pop = curStack.pop();
            tmpList.add(pop.val);

            if (flag % 2 == 0) {
                if (pop.left != null) {
                    nextStack.add(pop.left);
                }

                if (pop.right != null) {
                    nextStack.add(pop.right);
                }
            }

            if (flag % 2 == 1) {
                if (pop.right != null) {
                    nextStack.add(pop.right);
                }
                if (pop.left != null) {
                    nextStack.add(pop.left);
                }


            }


            if (curStack.isEmpty()) {
                curStack = nextStack;
                nextStack = new Stack<>();
                returnList.add(tmpList);
                tmpList = new ArrayList<>();
                flag++;
            }
        }
        return returnList;
    }
}
