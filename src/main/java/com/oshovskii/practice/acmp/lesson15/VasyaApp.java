package com.oshovskii.practice.acmp.lesson15;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class VasyaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int count = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.next());
        }

        for (int i = 0; i < count; i++) {
            if (list.get(i).matches("^[ABCEHKMOPTXY][0-9]{3}[ABCEHKMOPTXY]{2}$")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        out.flush();
    }
}
