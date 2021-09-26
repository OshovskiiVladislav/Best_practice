package com.oshovskii.practice.codewars.lesson1;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) {
            return null;
        }
        String[] stringsArray = phrase.split("");
        for (int i = stringsArray.length - 1; i > 0; i--) {
            if (stringsArray[i - 1].equals(" ")) {
                stringsArray[i] = stringsArray[i].toUpperCase();
            }
        }
        stringsArray[0] = stringsArray[0].toUpperCase();
        return String.join("", stringsArray);
    }
}
