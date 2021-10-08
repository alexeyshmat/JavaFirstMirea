package ru.mirea.task5.opt1;


public class DishTest {
    public static void main(String[] args) {
        RoundDish dish1 = new RoundDish("red", "Round", 12);
        System.out.println(dish1.toString());

        SaladDish dish2 = new SaladDish("brown", "Square", 20);
        System.out.println(dish2.toString());
    }
}
