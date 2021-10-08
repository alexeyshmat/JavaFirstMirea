package ru.mirea.task7.opt14;

public class Square extends Rectangle {
    double side;

    Square() {
        super();
    }

    Square(double side) {
        super();
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(length);
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString() {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}
