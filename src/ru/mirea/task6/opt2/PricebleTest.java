package ru.mirea.task6.opt2;

public class PricebleTest {
    public static void main(String[] args) {
        Priceble renault = new Cars(50000);
        System.out.println("Car price: " + renault.getPrice());
        renault = new Tables(135);
        System.out.println("Table price: " + renault.getPrice());
    }
}
