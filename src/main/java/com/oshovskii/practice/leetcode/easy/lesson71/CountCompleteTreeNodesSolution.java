package com.oshovskii.practice.leetcode.easy.lesson71;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 222. Count Complete Tree Nodes
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodesSolution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            count++;

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return count;
    }


    public int countNodesRecursive(TreeNode root) {
        if (root == null) return 0;

        return countAllNodes(root);
    }

    private int countAllNodes(TreeNode root) {
        if (root == null) return 0;

        int leftCount = countAllNodes(root.left);   // count all the nodes of left subtree
        int rightCount = countAllNodes(root.right); // count all the nodes of right subtree

        return leftCount + rightCount + 1;          // +1 is because we want to add the root node as well
    }
}
