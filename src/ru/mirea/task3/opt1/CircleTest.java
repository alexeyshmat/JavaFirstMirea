package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args){
        Circle circ1 = new Circle(10);
        System.out.println(circ1.getRad());
        System.out.println(circ1.getPer());
        System.out.println(circ1.getSq());
        Circle circ2 = new Circle();
        System.out.println(circ2.getRad());
        System.out.println(circ2.getPer());
        System.out.println(circ2.getSq());
    }
}
