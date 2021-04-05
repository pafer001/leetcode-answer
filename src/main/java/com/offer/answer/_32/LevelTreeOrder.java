package com.offer.answer._32;

import java.util.ArrayList;
import java.util.LinkedList;

public class LevelTreeOrder {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        final LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        ArrayList<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {

            final TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        int[] array = new int[ans.size()];

        int index = 0;
        for (Integer e : ans) {
            array[index++] = e;
        }
        return array;

    }
}
