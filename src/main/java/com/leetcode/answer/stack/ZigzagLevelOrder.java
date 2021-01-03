package com.leetcode.answer.stack;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层次遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ZigzagLevelOrder {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> returnList = new ArrayList<>();

        List<TreeNode> nodeList = new ArrayList<>();
        List<TreeNode> tmpNodeList = new ArrayList<>();
        nodeList.add(root);

        int whileCount = 0;
        while (!nodeList.isEmpty() || !tmpNodeList.isEmpty()) {
            whileCount = whileCount +1;
            List<Integer> tmpList = new ArrayList<>();
            if (nodeList.isEmpty()) {
                nodeList = tmpNodeList;
            }

            for (TreeNode node : nodeList) {

                if (node == null) {
                    continue;
                }

                if (whileCount % 2 == 1) {
                    tmpList.add(0, node.val);
                }else {
                    tmpList.add(node.val);
                }
                tmpNodeList.add(node.left);
                tmpNodeList.add(node.right);
            }

            returnList.add(tmpList);
        }


        return returnList;

    }

    private List<Integer> reverse(List<Integer> list) {

        List<Integer> list1 = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }

        return list1;
    }
}


