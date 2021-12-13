package ru.mirea.task25.opt1;

abstract class ShapeDecorator {
    Shape shape;
    public ShapeDecorator(Shape shape) { this.shape = shape; }
    public abstract void draw();
}

interface Shape { public void draw(); }

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) { super(shape); }

    public void draw() { shape.draw(); }
    void setRedBorder() { System.out.println("Red border"); }
}

class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle"); }
}

 class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();
        RedShapeDecorator rsd = new RedShapeDecorator(r);
        RedShapeDecorator csd = new RedShapeDecorator(c);

        rsd.setRedBorder();
        rsd.draw();
        System.out.println();
        csd.setRedBorder();
        csd.draw();
    }
}
