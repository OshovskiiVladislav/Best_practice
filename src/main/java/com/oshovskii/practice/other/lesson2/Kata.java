package com.oshovskii.practice.other.lesson2;

import java.util.stream.IntStream;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        int sumArr = getSum(arr);
        int sumMixed = getSum(mixedArr);
        return sumArr - sumMixed;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findDeletedNumberStream(int[] arr, int[] mixedArr) {
        return IntStream.of(arr).sum() - IntStream.of(mixedArr).sum();
    }
}


