package ru.mirea.task5.opt3;

import java.awt.*;

public abstract class Furniture {
    String material;
    double price;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String toString();

    public Furniture(String Material, double Price) {
            this.setMaterial(Material);
            this.setPrice(Price);
    }
}

class Table extends Furniture {
    String shape;
    int heigh;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHigh(int high) {
        this.heigh = heigh;
    }

    public Table(String Material, double Price, String Shape, int Heigh) {
        super(Material, Price);
        this.setShape(Shape);
        this.setHigh(Heigh);
    }

    public String toString() {
        return "Стол Материал: " + this.getMaterial() + " Цена: " + this.getPrice() + " Форма: " +this.getShape() + " Высота: " + this.getHeigh();
    }
}


class Cabinet extends Furniture {
    double volume;
    String color;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cabinet(String Material, double Price, double Volume, String Color) {
        super(Material, Price);
        this.setVolume(Volume);
        this.setColor(Color);
    }

    public String toString() {
        return "Шкаф Материал: " + this.getMaterial() + " Цена: " + this.getPrice() + " Объем: " +this.getVolume() + " Цвет: " + this.getColor();
    }
}

class Chair extends Furniture {
    int heigh;
    String Fabric;

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public String getFabric() {
        return Fabric;
    }

    public void setFabric(String fabric) {
        Fabric = fabric;
    }

    public Chair(String Material, double Price, int Heigh, String Fabric) {
        super(Material, Price);
        this.setHeigh(Heigh);
        this.setFabric(Fabric);
    }

    public String toString() {
        return "Стул Материал: " + this.getMaterial() + " Цена: " + this.getPrice() + " Высота: " +this.getHeigh() + " Ткань: " + this.getFabric();
    }
}
