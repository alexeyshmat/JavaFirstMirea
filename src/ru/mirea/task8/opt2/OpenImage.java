package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class OpenImage extends JFrame {

    public OpenImage() {
        Scanner in = new Scanner(System.in);
        String path;
        path = in.nextLine();
        Icon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame("Open image");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new OpenImage();
    }
}