package com.oshovskii.practice.leetcode.easy.lesson44;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqCharHashMap(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {
                map.put(str.charAt(i), 1);
                continue;
            }
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                return str.indexOf(c);
            }
        }

        return -1;
    }

    public int firstUniqCharOptimized(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z';i++) {
            int ind = s.indexOf (i);
            if (ind != -1 && ind == s.lastIndexOf (i))
                ans = Math.min (ans, ind);
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
