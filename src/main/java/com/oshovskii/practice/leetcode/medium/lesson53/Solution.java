package com.oshovskii.practice.leetcode.medium.lesson53;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }

    public static int partitionString(String s) {

        List<LinkedList<Character>> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> linkedList = new LinkedList<>();
            int index = i;
            while (!linkedList.contains(s.charAt(index))) {
                linkedList.add(s.charAt(index));
                if (index + 1 < s.length()) {
                    index++;
                } else {
                    break;
                }
            }
            list.add(linkedList);
        }

        int answer = 0;

        int prevIndex = 0;
        int preciousSize = 0;
        for (int i = 0; i < list.size(); i++) {

            if (i == prevIndex + preciousSize) {
                LinkedList<Character> characters = list.get(i);
                preciousSize = characters.size();
                prevIndex = i;
                answer++;
            }
        }

        return answer;
    }

    public int partitionStringOptima(String s) {
        int idx = 0;
        int count = 0;
        Map<Character, Boolean> mp = new HashMap<>(); // use a HashMap instead of an unordered_map
        while (idx < s.length()) {
            if (mp.containsKey(s.charAt(idx))) { // if current character has already appeared in current substring
                count++; // increment count
                mp.clear(); // clear HashMap to start a new substring
            }
            mp.put(s.charAt(idx), true); // mark current character as seen
            idx++; // move to next character
        }
        return count + 1; // return number of substrings (add 1 because we need to count the last substring as well)
    }
}
