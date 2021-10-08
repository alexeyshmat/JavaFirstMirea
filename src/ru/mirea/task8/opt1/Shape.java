package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int xPos;
    protected int yPos;

    Shape(){
        this.color = Color.black;
        this.xPos = 0;
        this.yPos = 0;
    }
}

class Circle extends Shape{
    protected int radius;

    public Circle(Color color, int x, int y){
        Random random = new Random();
        this.radius = 10 + random.nextInt(150+1);
        this.color = color;
        this.xPos = x;
        this.yPos = y;
    }
}

class Rectangle extends Shape{
    protected int width;
    protected int length;

    public Rectangle(Color color, int x, int y){
        Random random = new Random();
        this.width = 10 + random.nextInt(150+1);
        this.length = 10 + random.nextInt(150+1);
        this.color = color;
        this.xPos = x;
        this.yPos = y;
    }
}

class Square extends Shape{
    protected int side;

    Square(Color color, int x, int y){
        Random random = new Random();
        this.side = 20 + random.nextInt(50+1);
        this.color = color;
        this.xPos = x;
        this.yPos = y;
    }
}
