package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(20.12, 14.0);
        System.out.println(ball1.toString());
        ball1.move(11.4, 12.0);
        System.out.println(ball1.toString());
        Ball ball2 = new Ball();
        System.out.println(ball2.toString());
        ball2.move(11.4, 12.0);
        System.out.println(ball2.toString());
    }
}
