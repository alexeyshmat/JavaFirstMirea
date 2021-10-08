package ru.mirea.task6.opt1;

public class Cars implements Nameble {
    String name;

    Cars (String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name + " is car";
    }
}
