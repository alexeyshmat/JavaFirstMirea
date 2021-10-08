package ru.mirea.task6.opt2;

class Cars implements Priceble {
    int price;

    Cars (int Price) {
        this.price = Price;
    }

    public int getPrice() {
        return this.price;
    }
}