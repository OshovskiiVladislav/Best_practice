package com.oshovskii.practice.leetcode.easy.lesson65;

/**
 * 100. Same Tree
 * https://leetcode.com/problems/same-tree/
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class SameTreeSolution {
    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        ));

        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), null),
                new TreeNode(1, null, new TreeNode(2))
        ));

        System.out.println(isSameTree(
                new TreeNode(),
                new TreeNode(0)
        ));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null) {
            return false;
        } else if (q == null) {
            return false;
        }
        Deque<TreeNode> stackP = new ArrayDeque<>();
        stackP.push(p);
        Deque<TreeNode> stackQ = new ArrayDeque<>();
        stackQ.push(q);

        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode nodeP = stackP.pop();
            TreeNode nodeQ = stackQ.pop();

            if (nodeP.val != nodeQ.val) {
                return false;
            }

            if (nodeP.right != null || nodeQ.right != null) {
                System.out.println(nodeP.right);
                System.out.println(nodeQ.right);
                if (nodeP.right == null || nodeQ.right == null) {
                    return false;
                }
                if (nodeP.right.val != nodeQ.right.val) {
                    return false;
                } else {
                    stackP.push(nodeP.right);
                    stackQ.push(nodeQ.right);
                }
            }

            if (nodeP.left != null || nodeQ.left != null) {
                System.out.println(nodeP.left);
                System.out.println(nodeQ.left);
                if (nodeP.left == null || nodeQ.left == null) {
                    return false;
                }
                if (nodeP.left.val != nodeQ.left.val) {
                    return false;
                } else {
                    stackP.push(nodeP.left);
                    stackQ.push(nodeQ.left);
                }
            }
        }
        return true;
    }

}

