package ru.mirea.task10.opt14;

public class Lnumbers {

    public Lnumbers(int number) {
        Print(number);
    }


    public void Print (int number) {
        int d = Check(number);
        System.out.println(number / (int) Math.pow(10, d - 1));
        if(d > 1 ) {
            Print(number % (int) Math.pow(10, d - 1));
        }
    }

    public int Check(int number) {
        int n = 1;
        if(number > 10) {
            n += Check(number / 10);
        }
        return n;
    }

    public static void main(String[] args) {
        Lnumbers l = new Lnumbers(4321);
    }
}
