package com.oshovskii.practice.leetcode.easy.lesson72;

/**
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTreeSolution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public TreeNode invertTreeWithHelper(TreeNode root) {
        helper(root);
        return root;
    }

    void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        helper(root.left);
        helper(root.right);

    }

    public TreeNode invertTreeOneLine(TreeNode root) {
        return root == null ? root : new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }

}
