package ru.mirea.task1.opt3;


public class Sum {
    static int[] arr = {2, 4, 6, 8, 10, 12};

    public static void Sum_for() {
        int s = 0;
        for (int i=0;i<6;i++) {
            s = s + arr[i];
        }
        System.out.println(s);
    }

    public static void Sum_while(){
        int s = 0;
        int i = 0;
        while(i < arr.length){
            s = s + arr[i];
            i++;
        }
        System.out.println(s);
    }

    public static void Sum_do_while(){
        int s = 0;
        int i = 0;
        do{
            s = s + arr[i];
            i ++;
        }
        while(i < arr.length);
        System.out.println(s);
    }

    public static void main(String[] args){
        Sum_for();
        Sum_while();
        Sum_do_while();
    }
}

