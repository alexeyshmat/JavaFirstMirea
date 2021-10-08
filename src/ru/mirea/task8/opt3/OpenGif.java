package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class OpenGif extends JFrame {

    public OpenGif() {
        Icon icon = new ImageIcon("C:\\Users\\user\\Downloads\\NyanCat.gif");
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame("Open gif");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new OpenGif();
    }
}