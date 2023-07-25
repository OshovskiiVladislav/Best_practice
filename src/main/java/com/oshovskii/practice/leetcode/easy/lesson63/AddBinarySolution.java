package com.oshovskii.practice.leetcode.easy.lesson63;

import java.math.BigInteger;

public class AddBinarySolution {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            result.append(carry % 2);
            carry /= 2;
        }

        return result.reverse().toString();

    }

    public String addBinary2(String a, String b) {
        BigInteger m = new BigInteger(a, 2);
        BigInteger n = m.add(new BigInteger(b, 2));


        return n.toString(2);

    }
}
