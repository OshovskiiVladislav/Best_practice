package com.oshovskii.practice.leetcode.easy.lesson69;

import java.util.*;

public class MaximumDepthOfBinaryTreeSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentTreeNode = queue.poll();

                if (currentTreeNode.left != null) {
                    queue.add(currentTreeNode.left);
                }

                if (currentTreeNode.right != null) {
                    queue.add(currentTreeNode.right);
                }
            }
        }
        return level;
    }

    private static HashMap<Integer, List<TreeNode>> hashMap = new HashMap<>();

    public int maxDepthHashMapRecursion(TreeNode root) {
        int level = 0;
        hashMap.put(0, List.of(root));
        putChildrenInList(root, level + 1);
        return hashMap.size();
    }

    public static void putChildrenInList(TreeNode treeNode, int level) {

        if (!hashMap.containsKey(level) && (treeNode.left != null || treeNode.right != null)) {
            hashMap.put(level, new ArrayList<>());
        }

        if (treeNode.left != null) {
            List<TreeNode> list = hashMap.get(level);
            list.add(treeNode.left);
            hashMap.put(level, list);
            putChildrenInList(treeNode.left, level + 1);
        }

        if (treeNode.right != null) {
            List<TreeNode> list = hashMap.get(level);
            list.add(treeNode.right);
            hashMap.put(level, list);
            putChildrenInList(treeNode.right, level + 1);
        }

    }

    public int maxDepthRecursion(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
