
package ru.mirea.task3.opt1;


import java.util.Scanner;

public class Circle {
    public Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println(("Введите радиус окружности:"));
        if(sc.hasNextDouble()){
            setParam(sc.nextDouble());
        }
        else System.out.println(("Введено не числовое значение"));
    }

    public Circle(double rad)
    {
        setParam(rad);
    }

    private double Rad;

    private double Sq;

    private double Per;

    public double getRad() {
        return Rad;
    }

    public double getSq(){
        return Sq;
    }

    public double getPer() {
        return Per;
    }

    public void setParam(double rad) {
        Rad = rad;
        Sq = Math.PI * Math.pow(Rad, 2);
        Per = Math.PI * Rad * 2;
    }
}
