package ru.mirea.task2.opt2;

public class Ball {
    public Ball(){
        setRad(1);
        setPres(1);
    }

    public Ball(double rad){
        setRad(rad);
        setPres(1);
    }

    public Ball(double rad, double pres){
        setRad(rad);
        setPres(pres);
    }

    private double Rad;

    private double Pres;

    public double getRad() {
        return Rad;
    }

    public double getPres() {
        return Pres;
    }

    public void setRad(double rad) {
        Rad = rad;
    }

    public void setPres(double pres) {
        Pres = pres;
    }

    public static void main(String[] args){

    }
}
