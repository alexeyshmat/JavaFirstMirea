package ru.mirea.task21.opt1;

import java.util.LinkedList;

public class Metrolines {
    LinkedList<String> lines;
    Metrolines(LinkedList<String> l){
        lines = l;
    }
    public void PrintList(Boolean flag){
        for(int i = 0; i < lines.size(); i++){
            if((flag) & (i % 2 == 1)) System.out.println(lines.get(i));
            else if((!flag) & (i % 2 == 0)) System.out.println(lines.get(i));
        }
        System.out.println("\n");
    }
}

class Test{
    public static void main(String[] args) {
        LinkedList<String> lines= new LinkedList<String>();
        lines.add("Sokolnicheskaya");
        lines.add("Zamoskvoretskaya");
        lines.add("Arbatsko-Pokrovskaya");
        lines.add("Filyovskaya");
        lines.add("Koltsevaya");
        lines.add("Kazansko-Rizhskaya");
        Metrolines metro = new Metrolines(lines);
        metro.PrintList(true);
        metro.PrintList(false);
    }
}