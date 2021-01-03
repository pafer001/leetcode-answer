package com.leetcode.answer.stack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostorderTraversal {

    public static void main(String[] args) {

        final TreeNode _3Node = new TreeNode();
        _3Node.val = 3;

        final TreeNode _2Node = new TreeNode();
        _2Node.val = 2;


        final TreeNode _1Node = new TreeNode();
        _1Node.val = 1;
        _1Node.right = _2Node;
        _2Node.left = _3Node;

        final List<Integer> retList = new PostorderTraversal().postorderTraversal(_1Node);
        System.out.println(retList);

    }




    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> returnList = new ArrayList<>();
        TreeNode prev = null;
        while (!stack.isEmpty() || root != null) {


            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.right == null || root.right == prev) {
                returnList.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }

        }
        return returnList;

    }
}
