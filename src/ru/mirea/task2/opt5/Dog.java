package ru.mirea.task2.opt5;

public class Dog {
    private String name;

    private int age;

    public Dog(String Name, int Age){
        setName(Name);
        setAge(Age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    public void ToString() {
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge() + " Human age: " + getHumanAge());
    }
}
