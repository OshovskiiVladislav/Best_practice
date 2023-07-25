package com.oshovskii.practice.leetcode.easy.lesson52;

public class MergeStringsAlternatelySolution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abqwe", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder stringBuilder = new StringBuilder();

        int index = 0;
        while (index < word1Length && index < word2Length) {
            stringBuilder.append(word1.charAt(index));
            stringBuilder.append(word2.charAt(index));
            index++;
        }

        stringBuilder.append(word1.substring(index));
        stringBuilder.append(word2.substring(index));
        return stringBuilder.toString();
    }

}
