package com.oshovskii.practice.leetcode.medium.lesson60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 797. All Paths From Source to Target
 */
public class AllPathsFromSourceToTargetSolution {
    public static void main(String[] args) {
        int[][] graph1 = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        int[][] graph2 = new int[][]{{2}, {}, {1}};
        System.out.println(allPathsSourceTarget(graph2));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph == null) {
            return Collections.emptyList();
        }
        if (graph.length == 1) {
            return List.of(List.of(graph[0][0]));
        }

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(0);
        searchPaths(graph, graph[0], tmp, result);
        return result;
    }

    private static void searchPaths(int[][] graph, int currentArrayDigits[], List<Integer> list, List<List<Integer>> result) {
        if (list.contains(graph.length - 1)) {
            result.add(list);
            return;
        }
        for (int i = 0; i < currentArrayDigits.length; i++) {
            ArrayList<Integer> integers = new ArrayList<>(list);
            integers.add(currentArrayDigits[i]);
            searchPaths(graph, graph[currentArrayDigits[i]], integers, result);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    public List<List<Integer>> allPathsSourceTarget2(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        dfs(graph, 0, graph.length - 1, new ArrayList<>(), ans, vis);
        return ans;
    }

    void dfs(int[][] graph, int ind, int n, List<Integer> l, List<List<Integer>> ans, boolean[] vis) {
        if (ind == n) {
            l.add(n);
            ans.add(new ArrayList<>(l));
        } else {
            l.add(ind);
            vis[ind] = true;
            for (int n1 : graph[ind]) {
                if (vis[n1] == false)
                    dfs(graph, n1, n, l, ans, vis);
            }
        }

        vis[ind] = false;
        l.remove(l.size() - 1);
    }

    // -----------------------------------------------------------------------------------------------------------------

    public List<List<Integer>> allPathsSourceTarget3(int[][] graph) {
        Queue<BfsNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(new BfsNode(0, new ArrayList<>()));
        while (!queue.isEmpty()) {
            BfsNode node = queue.poll();
            node.path.add(node.vertex);
            if (node.vertex == graph.length - 1) {
                result.add(node.path);
            } else {
                for (int nextNode : graph[node.vertex]) queue.add(new BfsNode(nextNode, new ArrayList<>(node.path)));
            }
        }
        return result;
    }

    private static class BfsNode {
        int vertex;
        List<Integer> path;

        BfsNode(int vertex, List<Integer> path) {
            this.vertex = vertex;
            this.path = path;
        }
    }

}
