package com.oshovskii.practice.leetcode.easy.lesson68;

import java.util.ArrayDeque;

/**
 * 101. Symmetric Tree
 */

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
public class SymmetricTreeSolution {
    public boolean isSymmetricRecursion(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        TreeNode treeNodeLeft = root.left;
        TreeNode treeNodeRight = root.right;
        if (treeNodeLeft.val != treeNodeRight.val) {
            return false;
        }

        ArrayDeque<TreeNode> queueTreeNode = new ArrayDeque<>();
        queueTreeNode.addFirst(treeNodeLeft);
        queueTreeNode.addLast(treeNodeRight);

        TreeNode currentTreeNodeLeft;
        TreeNode currentTreeNodeRight;
        boolean isIncorrect = false;
        while (!queueTreeNode.isEmpty()) {
            currentTreeNodeLeft = queueTreeNode.removeFirst();
            currentTreeNodeRight = queueTreeNode.removeLast();

            if (currentTreeNodeLeft.val != currentTreeNodeRight.val) {
                return false;
            }

            if (currentTreeNodeLeft.left != null && currentTreeNodeRight.right != null) {
                queueTreeNode.addFirst(currentTreeNodeLeft.left);
                queueTreeNode.addLast(currentTreeNodeRight.right);
            } else if (currentTreeNodeLeft.left != null || currentTreeNodeRight.right != null) {
                isIncorrect = true;
            }

            if (currentTreeNodeLeft.right != null && currentTreeNodeRight.left != null) {
                queueTreeNode.addFirst(currentTreeNodeLeft.right);
                queueTreeNode.addLast(currentTreeNodeRight.left);
            } else if (currentTreeNodeLeft.right != null || currentTreeNodeRight.left != null) {
                isIncorrect = true;
            }

            if (isIncorrect) {
                return false;
            }
        }
        return true;
    }

}




