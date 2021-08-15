package com.oshovskii.practice.acmp.lesson9;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        String[] arr = str.split("1");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) (arr[i].length() + 97));
        }
        System.out.println();
        out.flush();
    }
    /*
        1001010101000000000000011111111
        [, 00, 0, 0, 0, 0000000000000]
        acbbbn

        не работает, тут неправильно выводит

        11111111111111111111111111111111111111111111111111111111111
        []
     */
}
