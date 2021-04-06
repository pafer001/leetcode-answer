package com.offer.answer._34_;

import java.util.ArrayList;
import java.util.List;

public class TreePathSum {

    List<List<Integer>> returnList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<Integer> path = new ArrayList<>();
        corePathSum(root, target, path);

        return returnList;
    }

    public void corePathSum(TreeNode root, int target, List<Integer> path) {


        if (root == null) {
            return;
        }

        path.add(root.val);

        int diffTarget = target - root.val;
        if (root.left == null && root.right == null && diffTarget == 0) {
            returnList.add(path);
            return;
        }
        corePathSum(root.left, diffTarget, new ArrayList<>(path));
        corePathSum(root.right, diffTarget, new ArrayList<>(path));

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
