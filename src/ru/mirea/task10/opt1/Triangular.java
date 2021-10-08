package ru.mirea.task10.opt1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Triangular {

    public Triangular() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        for (int i = 1; i <= n; i++) {
            str += String.join(" ", Collections.nCopies(i, String.valueOf(i) )) + " ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Triangular l = new Triangular();
    }
}

