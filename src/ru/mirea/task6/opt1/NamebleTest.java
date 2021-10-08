package ru.mirea.task6.opt1;

public class NamebleTest {
    public static void main(String[] args) {
        Nameble mercury = new Cars("Mercury");
        System.out.println(mercury.getName());
        mercury = new Planets("Mercury");
        System.out.println(mercury.getName());
    }
}
