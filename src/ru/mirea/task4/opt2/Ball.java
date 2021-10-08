package ru.mirea.task4.opt2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double X, double Y) {
        x = X;
        y = Y;
    }

    public Ball() {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString() {
        return "x: " + this.getX() + " y: " + this.getY();
    }
}
