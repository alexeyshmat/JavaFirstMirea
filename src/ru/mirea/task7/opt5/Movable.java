package ru.mirea.task7.opt5;

public interface Movable {
    void moveUp(int X);
    void moveDown(int X);
    void moveLeft(int Y);
    void moveRight(int Y);
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int X, int Y) {
        this.x = X;
        this.y = Y;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public void moveUp(int X) {
        this.x += X;
        this.xSpeed = X;
    }

    public void moveDown(int X) {
        this.x -= X;
        this.xSpeed = this.xSpeed * 0 - X;
    }

    public void moveLeft(int Y) {
        this.y -= Y;
        this.ySpeed = this.ySpeed * 0 - Y;
    }

    public void moveRight(int Y) {
        this.y += Y;
        this.ySpeed = Y;
    }

    public String toString() {
        return "X: " + this.x + " xSpeed: " + this.xSpeed + "\nY: " + this.y + " ySpeed: " + this.ySpeed;
    }
}

class MovableCircle extends MovablePoint {
    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int Radius) {
        super(x, y);
        this.radius = Radius;
    }

    public void moveUp(int X) {
        this.x += X;
        this.xSpeed = X;
    }

    public void moveDown(int X) {
        this.x -= X;
        this.xSpeed = this.xSpeed * 0 - X;
    }

    public void moveLeft(int Y) {
        this.y -= Y;
        this.ySpeed = this.ySpeed * 0 - Y;
    }

    public void moveRight(int Y) {
        this.y += Y;
        this.ySpeed = Y;
    }

    public String toString() {
        return super.toString()+ "\nRadius: " + this.radius;
    }
}

class MovableRectangle implements Movable{

    MovablePoint topLeft;
    MovablePoint bottomRight;

    public void moveUp(int X) {
        this.bottomRight.y += X;
        this.topLeft.y += X;
        this.bottomRight.xSpeed = X;
        this.topLeft.xSpeed = X;
    }

    public void moveDown(int X) {
        this.bottomRight.y -= X;
        this.topLeft.y -= X;
        this.bottomRight.xSpeed = this.bottomRight.xSpeed * 0 - X;
        this.topLeft.xSpeed = this.topLeft.xSpeed * 0 - X;
    }

    public void moveLeft(int Y) {
        this.bottomRight.y -= Y;
        this.topLeft.y -= Y;
        this.bottomRight.ySpeed = this.bottomRight.ySpeed * 0 - Y;
        this.topLeft.ySpeed = this.topLeft.ySpeed * 0 - Y;
    }

    public void moveRight(int Y) {
        this.bottomRight.y -= Y;
        this.topLeft.y -= Y;
        this.bottomRight.ySpeed = Y;
        this.topLeft.ySpeed = Y;
    }

    public String toString(){
        return "topLeft_x: "+this.topLeft.x+", topLeft_y: "+this.topLeft.y+", bottomRight_x: "+this.bottomRight.x+", bottomRight_y: "+this.bottomRight.y+",xSpeed: "+this.topLeft.xSpeed+", ySpeed: "+this.bottomRight.ySpeed;
    };

}