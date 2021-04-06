package com.offer.answer._37;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SerializeTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if (root == null) {
            return "[]";
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            if (node != null) {

                buffer.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                buffer.append("null,");
            }

        }

        buffer.deleteCharAt(buffer.length() - 1);
        buffer.append("]");

        return buffer.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data.equals("[]")) {
            return null;
        }
        final String[] dataArray = data.substring(1, data.length() - 1).split(",");
        LinkedList<TreeNode> queue = new LinkedList();
        final TreeNode root = new TreeNode(Integer.parseInt(dataArray[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < dataArray.length  ) {
            final TreeNode poll = queue.poll();
            if (!dataArray[i].equals("null")) {
                final TreeNode node = new TreeNode(Integer.parseInt(dataArray[i]));
                queue.add(node);
                poll.left = node;
            }
            i++;
            if (!dataArray[i].equals("null")) {
                final TreeNode node = new TreeNode(Integer.parseInt(dataArray[i]));
                queue.add(node);
                poll.right = node;
            }
            i++;

        }
        return root;



    }

    public static void main(String[] args) {

        String s = "[1,2,3,null,null,4,5]";

        final TreeNode deserialize = new SerializeTree().deserialize(s);
        System.out.println(deserialize);
    }
}
