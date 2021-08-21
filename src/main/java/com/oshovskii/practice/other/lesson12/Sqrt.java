package com.oshovskii.practice.other.lesson12;

public class Sqrt {
    public static int calculateSqrt(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("incorret number");
        }
        int low = 0;
        int midSquare;
        int high = input;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            midSquare = mid * mid;
            if (midSquare == input) {
                return mid;
            }
            if (midSquare > input) {
                high = mid - 1;
            }
            if (midSquare < input) {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}
