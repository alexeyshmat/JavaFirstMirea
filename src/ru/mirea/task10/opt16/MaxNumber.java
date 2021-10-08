package ru.mirea.task10.opt16;

import java.util.Scanner;

public class MaxNumber {

    public MaxNumber() {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        int counter = 1;
        int num = temp;
        while (temp != 0) {
            temp = in.nextInt();
            if (temp != num) {
                if (temp > num) {
                    num = temp;
                    counter = 1;
                }
            }
            else {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        MaxNumber l = new MaxNumber();
    }
}
