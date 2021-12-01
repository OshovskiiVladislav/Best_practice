package com.oshovskii.practice.leetcode.medium.lesson2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"abc", "abc", "cba", "was", "dsda"}));
        System.out.println(groupAnagrams2(new String[]{"abc", "abc", "cba", "was", "dsda"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String[], List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Boolean flag = false;
            String[] arrWord = Arrays.stream(strs[i].split("")).sorted(Comparator.naturalOrder()).toArray(String[]::new);
            for (String[] arr : hashMap.keySet()) {
                if (Arrays.equals(arr, arrWord)) {
                    hashMap.get(arr).add(strs[i]);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                hashMap.put(arrWord, new ArrayList<>());
                hashMap.get(arrWord).add(strs[i]);
            }
        }
        List<List<String>> resultSuperList = new ArrayList<>();
        for (String[] arr : hashMap.keySet()) {
            resultSuperList.add(hashMap.get(arr));
        }
        return resultSuperList;
    }

    /**
     * 26 - это количестово английских букв
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
