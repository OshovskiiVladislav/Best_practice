package com.oshovskii.practice.leetcode.medium.lesson62;

import java.util.*;
import java.util.stream.Collectors;

public class LongestPalindromicSubstringSolution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbannttttnn"));
        System.out.println(longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
        System.out.println(longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
        System.out.println(longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
    public static String longestPalindrome(String s) {
        Set<String> stringStorageSet = new HashSet<>(s.length());
        HashMap<Character, Integer> characterExistedMap = new HashMap<>();

        if (isPalindromeRegular(s)) {
            return s;
        }

        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (characterExistedMap.containsKey(currentChar)) {
                characterExistedMap.put(currentChar, characterExistedMap.get(s.charAt(i)) + 1);
            } else {
                characterExistedMap.put(currentChar, 1);
            }
        }


        for (int beginIndex = 0; beginIndex < s.length() - 1; beginIndex++) {
            char savedCharacter = s.charAt(beginIndex);
            for (int j = beginIndex + 1; j < s.length(); j++) {
                char currentCharacter = s.charAt(j);
                if (savedCharacter == currentCharacter) {

                    String currentString = s.substring(beginIndex, j + 1);

                    stringStorageSet.add(currentString);
                }

            }

        }

        List<String> collect = stringStorageSet.stream().sorted((o1, o2) -> o2.length() - o1.length()).collect(Collectors.toList());

        System.out.println(collect);

        for (String current : collect) {
            if (isPalindromeRegular(current)) {
                return current;
            }
        }
        return String.valueOf(s.charAt(0));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.toLowerCase());
        int idx = 0;
        while (idx < stringBuilder.length()) {
            char ch = stringBuilder.charAt(idx);
            if (Character.isLetterOrDigit(ch)) {
                idx += 1;
            } else {
                stringBuilder.deleteCharAt(idx);
            }
        }
        int n = stringBuilder.length();

        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            if (stringBuilder.charAt(i) != stringBuilder.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRegular(String s) {
        String trimmed = s.toLowerCase().replaceAll("[\\W_]", "");
        String reversed = new StringBuilder(trimmed).reverse().toString();

        return trimmed.equals(reversed);
    }

}
