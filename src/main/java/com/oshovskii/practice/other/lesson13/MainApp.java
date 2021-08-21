package com.oshovskii.practice.other.lesson13;

public class MainApp {
    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = charArray.length - 1; i >= 0; i--) {
            newCharArray[i] = charArray[charArray.length - i - 1];
        }
        return new String(newCharArray);
    }
}
