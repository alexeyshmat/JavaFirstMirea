package ru.mirea.task10.opt15;

public class Rnumbers {

    public Rnumbers(int number) {
        Print(number);
    }

    public void Print (int number) {
        System.out.println(number % 10);
        if(number > 9 ) {
            Print(number / 10);
        }
    }

    public static void main(String[] args) {
       Rnumbers l = new Rnumbers(4321);
    }
}
