package com.oshovskii.practice.leetcode.medium;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    // TODO: вывести ровно один повторяющийся элемент

    public static void main (String[] args) {
        int [] arr = {0, 1, 2, 3, 1, 4};
        System.out.println(findDuplicate(arr));
    }

    public static OptionalInt findDuplicate(int [] arr) {
        if (arr.length == 0) {
            throw new NumberFormatException("Array is empty...");
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return OptionalInt.of(arr[i]);
            }
        }
        return OptionalInt.empty();
    }
}
