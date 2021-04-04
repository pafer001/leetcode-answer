package com.offer.answer._26;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TreeSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {


        return A != null && B != null && (isCoreSubStructure(A, B) || isSubStructure(A.left, B)|| isSubStructure(A.right, B)) ;

    }


    public boolean isCoreSubStructure(TreeNode A, TreeNode B) {

        if (B == null) {
            return true;
        }

        if (A == null || A.val != B.val) {
            return false;
        }

        return isCoreSubStructure(A.left, B.left) && isCoreSubStructure(A.right, B.right);
    }



}
