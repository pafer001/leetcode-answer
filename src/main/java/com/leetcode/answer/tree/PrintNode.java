package com.leetcode.answer.tree;
import java.util.*;

public class PrintNode {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>>  resList =   new ArrayList<ArrayList<Integer> >();

        if(pRoot == null) {
            return resList;
        }
        LinkedList<TreeNode> queue =  new LinkedList<TreeNode>();
        queue.add(pRoot);

        ArrayList<Integer> list = new  ArrayList<Integer> ();
        LinkedList<TreeNode> tmpQueue =  new LinkedList<TreeNode>();

        while(!queue.isEmpty()) {

            TreeNode node = queue.poll();
            list.add(node.val);

            if(node.left != null) {
                tmpQueue.add(node.left);
            }
            if(node.right != null) {
                tmpQueue.add(node.right);
            }

            if(queue.isEmpty()) {
                resList.add(list);
                queue = tmpQueue;
                list = new  ArrayList<Integer> ();
                tmpQueue = new LinkedList<TreeNode>();
            }


        }

        return resList;


    }
}
