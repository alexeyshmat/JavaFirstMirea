package ru.mirea.task7.opt5;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint dot = new MovablePoint(1, 1);
        System.out.println(dot.toString());
        dot.moveDown(2);
        dot.moveLeft(4);
        System.out.println(dot.toString());
        MovableCircle circ = new MovableCircle(2, 2, 4);
        System.out.println(circ.toString());
    }
}
