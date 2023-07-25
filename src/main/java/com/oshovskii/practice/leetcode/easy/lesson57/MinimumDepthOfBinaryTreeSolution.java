package com.oshovskii.practice.leetcode.easy.lesson57;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode 111
 */
public class MinimumDepthOfBinaryTreeSolution {
    public static void main(String[] args) {
        System.out.println(minDepth(new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                    new TreeNode(15), new TreeNode(7)))));
    }

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

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int minDepth = 1;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null) {
                    return minDepth;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            minDepth++;
        }

        return minDepth;
    }

    public int minDepth2(TreeNode root) {

        // base case: if root is null, return 0
        if(root == null){
            return 0;
        }

        // if root has no children, return 1
        if(root.left == null && root.right == null){
            return 1;
        }

        // if root has no left child, return the min depth of the right subtree + 1
        if(root.left == null){
            return minDepth(root.right) + 1;
        }

        // if root has no right child, return the min depth of the left subtree + 1
        if(root.right == null){
            return minDepth(root.left) + 1;
        }

        // if root has both left and right children, return the min depth of the left and right subtrees + 1
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
