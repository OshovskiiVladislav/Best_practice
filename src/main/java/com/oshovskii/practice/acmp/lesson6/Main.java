package com.oshovskii.practice.acmp.lesson6;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        String[] arr = str.split("\\s+");
        String str1 = arr[1].substring(0, Integer.parseInt(arr[0]) - 1);
        String str2 = arr[1].substring(Integer.parseInt(arr[0]));
        System.out.println(str1 + str2);

        out.flush();
    }
}
