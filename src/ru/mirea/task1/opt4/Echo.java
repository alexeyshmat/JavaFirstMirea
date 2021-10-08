package ru.mirea.task1.opt4;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Input a number: ");
            int num = in.nextInt();
            System.out.printf("Your number: %d \n", num);
        }
    }
}
