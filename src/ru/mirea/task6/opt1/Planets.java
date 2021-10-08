package ru.mirea.task6.opt1;

class Planets implements Nameble {
    String name;

    Planets (String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name + " is planet";
    }
}
