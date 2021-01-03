package com.leetcode.answer.stack;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 *
 *
 * 输入：root = [1,2]
 * 输出：[1,2]
 * 示例 5：
 *
 *
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 *  
 *
 * 提示：
 *
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 *  
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PreorderTraversal {

    public static void main(String[] args) {

        final TreeNode _3Node = new TreeNode();
        _3Node.val = 3;

        final TreeNode _2Node = new TreeNode();
        _2Node.val = 2;


        final TreeNode _1Node = new TreeNode();
        _1Node.val = 1;
        _1Node.right = _2Node;
        _2Node.left = _3Node;

        final List<Integer> retList = new PreorderTraversal().preorderTraversal(_1Node);
        System.out.println(retList);

    }

    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> returnList = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (!stack.isEmpty() || root != null) {

            if (root != null) {
                returnList.add(root.val);
                stack.push(root);
                root = root.left;
                continue;
            }

            root = stack.pop().right;
        }

        return returnList;
    }
}
