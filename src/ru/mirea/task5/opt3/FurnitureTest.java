package ru.mirea.task5.opt3;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();
        for (int i = 0; i < 5; i++){
            Furniture x = new Table("steel", 800.8, "circle", 80);
            furnitureShop.Add(x);
        }
        for (int i = 0; i < 5; i++){
            Furniture x = new Cabinet("wood", 500.0, 300, "Red");
            furnitureShop.Add(x);
        }
        for (int i = 0; i < 5; i++){
            Furniture x = new Chair("plastic", 20.3, 50, "nelon");
            furnitureShop.Add(x);
        }
        for(int i = 0; i < 5; i++){
            System.out.println(furnitureShop.getFurniture(i));
            System.out.println(furnitureShop.getFurniture(i + 5));
            System.out.println(furnitureShop.getFurniture(i + 10));
        }
    }
}
