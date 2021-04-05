package com.offer.answer._32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelTreeOrder1 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        final LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int curCount = 1;
        int nextCount = 0;

        List<List<Integer>> returnList = new ArrayList<>();

        List<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty()) {

            final TreeNode poll = queue.poll();
            tmp.add(poll.val);
            curCount --;

            if (poll.left != null) {
                queue.add(poll.left);
                nextCount++;
            }

            if (poll.right != null) {
                queue.add(poll.right);
                nextCount++;
            }

            if (curCount ==0) {
                returnList.add(tmp);
                tmp = new ArrayList<>();
                curCount = nextCount;
                nextCount = 0;
            }
        }

        return returnList;

    }
}
