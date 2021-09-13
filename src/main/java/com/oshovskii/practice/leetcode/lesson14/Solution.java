package com.oshovskii.practice.leetcode.lesson14;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        if (s.isBlank()) {
            throw new IllegalArgumentException("String is empty");
        }

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');

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


    public boolean isValidFaster(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            if (stack.empty())
                return false;

            if (c == ')' && stack.pop() != '(')
                return false;
            if (c == '}' && stack.pop() != '{')
                return false;
            if (c == ']' && stack.pop() != '[')
                return false;
        }

        if (stack.empty())
            return true;

        return false;
    }
}
