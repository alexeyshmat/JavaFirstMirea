package ru.mirea.task7.opt14;

public class Circle extends Shape {
    double radius;

    Circle() {
        super();
        this.radius = 1;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius+ ", color: " + this.color;
    }
}
