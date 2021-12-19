package ru.mirea.task29.opt1;

import java.io.Serializable;
import java.io.*;

public class CurrencyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String City;
    private String Street;
    private int Home;

    public CurrencyInfo(String c, String s, int h){
        this.City = c;
        this.Street = s;
        this.Home = h;
    }

    @Override
    public String toString() {
        return "SavedCity: " + "\n" +
                "   City=" + City + "\n" +
                "   Street=" + Street + "\n" +
                "   Home=" + Home;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo currencyInfo = new CurrencyInfo("Moscow", "Vernadskogo prt.", 78);
        FileOutputStream outputStream = new FileOutputStream("/media/win10/Users/user/IdeaProjects/JavaFirstMirea/src/ru/mirea/task29/opt1/save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/media/win10/Users/user/IdeaProjects/JavaFirstMirea/src/ru/mirea/task29/opt1/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo currencyInfo2 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(currencyInfo2);
    }
}
