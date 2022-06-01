package com.oshovskii.practice.leetcode.easy.lesson47;

public class Solution {
    public static void main(String[] args) {
        System.out.println("reverseBits(0b101) = " + reverseBits(0b10100001010001011010000101000101));
    }

    /**
     * // Binary literal in int type
     *         int i1 = 0b101;     // Using b0, The b can be lower or upper case
     *         int i2 = 0B101;     // Using B0
     *         System.out.println("----------Binary Literal in Integer----------------");
     *         System.out.println("i1 = "+i1);
     *         System.out.println("i2 = "+i2);
     *         Print:
     *         s1 = 5
     *         s2 = 5
     */
    // you need treat n as an unsigned value
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        int x = 0;
        int r = 0;

        for(int i=0; i<32; i++){

            x = n & 1;
            n = n>>>1;
            r = r << 1;
            r = r | x;
        }

        return r;
    }

    public int reverseBits2(int n) {
        int mask = 1;
        // Update the first number
        int num = 0;
        // the length is guaranteed to be 32 -> 32 iteration
        for(int i = 1; i <= 32; i++){
            // this will return the last digit of the binary representation Ex: 101 & 1 -> 1, 100 & 1 -> 0
            int d = n & mask;
            // this will remove the last digit in the binary string. Ex: 100 >>= 1 -> 10, 1101  >>= 1 -> 1101
            n >>=1;
            // this will add 1 zero into the result. Ex: 1 <<=1 -> 10; 11101 <<= 1 -> 111010
            num <<= 1;
            // add the digit
            num += d;
        }
        return num;
    }
}
