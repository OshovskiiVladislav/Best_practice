package com.oshovskii.practice.leetcode.medium.lesson64;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersSolution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); // Expected 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); // Expected 3
        System.out.println(lengthOfLongestSubstring(" ")); // Expected 1
        System.out.println(lengthOfLongestSubstring("au")); // Expected 2
        System.out.println(lengthOfLongestSubstring("aab")); // Expected 2
        System.out.println(lengthOfLongestSubstring("dvdf")); // Expected 3
        System.out.println(lengthOfLongestSubstring("anviaj")); // Expected 5
        System.out.println(lengthOfLongestSubstring("qrsvbspk")); // Expected 5
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.isEmpty()) {
            return 0;
        }
        int count = 0;
        int previousResult = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                count++;
                System.out.println("if -> Iteration " + i + " set: " + set);
            } else {
                previousResult = Math.max(count, previousResult);
                count = 0;
                if (set.size() > 1) {
                    i = i + 1 - set.size();
                }
                System.out.println("else -> Iteration " + i + " set: " + set);
                set.clear();

                set.add(s.charAt(i));
                count++;
            }
        }

        if (count >= previousResult) {
            return count;
        } else {
            return previousResult;
        }
    }
}

