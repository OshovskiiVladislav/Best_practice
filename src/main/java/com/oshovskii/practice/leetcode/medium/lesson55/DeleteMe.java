package com.oshovskii.practice.leetcode.medium.lesson55;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteMe {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public char findTheDifferenceTheHindu(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }

    public static char findTheDifference(String s, String t) {
            HashMap<Character, Integer> mapCharacters = new HashMap<>();

            for (int i = 0; i <= s.length() - 1; i++) {
                Character currentCharS = s.charAt(i);
                if (mapCharacters.containsKey(currentCharS)) {
                    mapCharacters.put(currentCharS, mapCharacters.get(currentCharS) + 1);
                } else {
                    mapCharacters.put(currentCharS, 1);
                }
                Character currentCharT = t.charAt(i);
                if (mapCharacters.containsKey(currentCharT)) {
                    mapCharacters.put(currentCharT, mapCharacters.get(currentCharT) - 1);
                } else {
                    mapCharacters.put(currentCharT, -1);
                }
            }
            Set<Character> keysByValue = getKeysByValue(mapCharacters, -1);
            if (keysByValue.isEmpty()) {
                return t.charAt(t.length() - 1);
            }
            return keysByValue.stream().findFirst().get();
        }

        public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
            return map.entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), value))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
        }
}
