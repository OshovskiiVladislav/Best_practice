package com.oshovskii.practice.other.lesson8;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(array));
        revert(array);
        System.out.println(Arrays.toString(array));
    }

    private static void revert(int[] array) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int value : array) {
            deque.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = deque.pop();
        }
    }
}
