package ru.mirea.task10.opt17;

import java.util.Scanner;

public class MaxSequence {

    public MaxSequence() {
        System.out.println(Search());
    }

    public int Search() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number == 0) {
            return number;
        }
        else {
            int temp = Search();
            if(number < temp) {
                number = temp;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        MaxSequence l = new MaxSequence();
    }
}
