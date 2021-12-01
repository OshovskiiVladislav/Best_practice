package com.oshovskii.practice.leetcode.easy.lesson23;

import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            int countFirstRow = 0;
            int countSecondRow = 0;
            int countThirdtRow = 0;
            for (char ch : word.toCharArray()) {
                if (firstRow.contains(String.valueOf(ch).toLowerCase())) {
                    countFirstRow++;
                }
                if (secondRow.contains(String.valueOf(ch).toLowerCase())) {
                    countSecondRow++;
                }
                if (thirdRow.contains(String.valueOf(ch).toLowerCase())) {
                    countThirdtRow++;
                }
            }
            if ((countFirstRow > 0 && countSecondRow == 0 && countThirdtRow == 0)
                    || (countSecondRow > 0 && countFirstRow == 0 && countThirdtRow == 0)
                    || (countThirdtRow > 0 && countSecondRow == 0 && countFirstRow == 0)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public String[] findWord(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        String res = "";
        for (String i : words) {
            int first = 0, second = 0, third = 0;
            for (char ch : i.toCharArray()) {
                if (firstRow.contains(String.valueOf(ch).toLowerCase())) {
                    first++;
                } else if (secondRow.contains(String.valueOf(ch).toLowerCase())) {
                    second++;
                } else if (thirdRow.contains(String.valueOf(ch).toLowerCase())) {
                    third++;
                }
            }
            if (first == i.length() || second == i.length() || third == i.length()) {
                res += i + " ";
            }
        }
        String[] ans = res.split(" ");
        if (ans[0].equals("")) {
            return new String[0];
        }

        return ans;
    }
}
