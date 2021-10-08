package ru.mirea.task1.opt7;

public class Factotial {
    static long fact(int n) {
        long l = 1L;

        for(int i = 2; i <= n; ++i) {
            l *= (long)i;
        }

        return l;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));
    }
}
