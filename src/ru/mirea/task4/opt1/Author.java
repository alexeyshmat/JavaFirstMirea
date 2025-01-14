package ru.mirea.task4.opt1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String Name, String Email, char Gender) {
        name = Name;
        gender = Gender;
        setEmail(Email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + "(" + gender + ") at " + email;
    }

}
