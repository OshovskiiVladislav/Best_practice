package com.oshovskii.practice.acmp.lesson8;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        String[] arr = str.split("1+");

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max ) {
                max = arr[i].length();
            }
        }
        System.out.println(max);

        out.flush();
    }
}
