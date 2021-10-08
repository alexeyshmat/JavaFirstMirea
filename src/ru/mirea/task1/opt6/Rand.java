package ru.mirea.task1.opt6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rand {
    static int n = 10;
    static int[] arr = new int[n];
    static Random rand = new Random();

    public static void genArr() {
        for (int i=0; i<n; i++) {
            arr[i] = rand.nextInt();
        }
    }

    public static void printArr() {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void sortArr() {
        Arrays.sort(arr);
    }

    public static void main(String[] args){
        genArr();
        printArr();
        System.out.println("");
        sortArr();
        printArr();
    }
}
