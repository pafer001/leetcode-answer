package com.leetcode.answer.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 中序遍历树
 */
public class InorderTraversal {


    public static void main(String[] args) {

        final TreeNode _3Node = new TreeNode();
        _3Node.val = 3;

        final TreeNode _2Node = new TreeNode();
        _2Node.val = 2;


        final TreeNode _1Node = new TreeNode();
        _1Node.val = 1;
        _1Node.right = _2Node;
        _2Node.left = _3Node;

        final List<Integer> retList = new InorderTraversal().inorderTraversal(_1Node);
        System.out.println(retList);

    }


    public List<Integer> inorderTraversal(TreeNode root) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> returnList = new ArrayList<>();

       while (!stack.isEmpty() || root != null) {

             if (root != null) {
                 stack.push(root);
                 root = root.left;
                 continue;
             }

           root = stack.pop();
           returnList.add(root.val);
           root = root.right ;

       }
        return returnList;

    }
}

