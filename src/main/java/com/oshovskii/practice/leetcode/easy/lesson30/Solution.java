package com.oshovskii.practice.leetcode.easy.lesson30;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public int strString(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(needle.length()>haystack.length())
            return -1;

        int nSize = needle.length();
        int hSize = haystack.length();

        for(int i = 0; i < hSize-nSize; i++) {

            if(haystack.substring(i, i + nSize).equals(needle)) {
                return i;
            }
        }

        if(haystack.substring(hSize-nSize).equals(needle)) {
            return hSize-nSize;
        }

        return -1;
    }
}
