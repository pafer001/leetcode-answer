package com.offer.answer._33_;

public class VerifyPostorderTree {

    public boolean verifyPostorder(int[] postorder) {

        return verifyCorePostorder(postorder, 0, postorder.length - 1);
    }

    public boolean verifyCorePostorder(int[] postorder, int low, int high) {

        if (low > high) {
            return true;
        }
        int index = low;
        while (postorder[index] < postorder[high]) {
            index++;
        }

        int middle = index;
        while (postorder[index] > postorder[high]) {
            index++;
        }

        return index == high
                && verifyCorePostorder(postorder, low, middle - 1)
                && verifyCorePostorder(postorder, middle, high - 1);

    }
}
