package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public class RandomFigures extends JFrame {
    public RandomFigures(){
        super("Random figures");
        setLayout(new BorderLayout());
        setSize(800, 600);

        FigurePrint print = new FigurePrint();
        add(print);
    }

    public static void main(String[] args) {
        new RandomFigures().setVisible(true);
    }
}
