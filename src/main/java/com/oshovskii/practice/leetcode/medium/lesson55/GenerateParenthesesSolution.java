package com.oshovskii.practice.leetcode.medium.lesson55;

import java.util.*;

public class GenerateParenthesesSolution {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(isValid("(()()"));
        System.out.println(generateParenthesis(4));
    }

    public static List<String> generateParenthesis(int n) {
        if (n == 1) {
            return List.of("()");
        }
        List<String> result = new ArrayList<>();
        generateParentheses(n * 2, result, "", n, n);
        return result;
    }

    private static void generateParentheses(int countParentheses, List<String> result, String s, int openCharacter, int closeCharacter) {
        if (openCharacter == 0 && closeCharacter == 0) {
            result.add(s);
            return;
        }

        if (openCharacter > 0) {
            generateParentheses(countParentheses, result, s + "(", openCharacter - 1, closeCharacter);

        }
        if (closeCharacter > openCharacter) {
            generateParentheses(countParentheses, result, s + ")", openCharacter, closeCharacter - 1);
        }
    }

    public static boolean isValid(String s) {
        if (s.isBlank()) {
            return false;
        }

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
