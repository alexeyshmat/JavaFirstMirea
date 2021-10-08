package ru.mirea.task5.opt2;

public abstract class Dog {
    String fur;
    String size;

    String getFur(){
        return fur;
    }
    String getSize(){
        return size;
    }
    void setFur(String fur){
        this.fur = fur;
    }
    void setSize(String s){
        size = s;
    }

    public abstract String toString();
}

class Pom extends Dog{
    Pom(){
        size = "Маленький";
        fur = "Длинная";
    }

    public String toString() {
        return "Померанц; размер " + this.size + "; шерсть " + this.fur;
    }
}

class Labrador extends Dog{
    Labrador(){
        size = "Средний";
        fur = "Короткая";
    }

    public String toString() {
        return "Лабрадор; размер " + this.size + "; шерсть " + this.fur;
    }
}

class Husky extends Dog{
    Husky(){
        size = "Большой";
        fur = "Длинная";
    }

    public String toString() {
        return "Хаски; размер " + this.size + "; шерсть " + this.fur;
    }
}

