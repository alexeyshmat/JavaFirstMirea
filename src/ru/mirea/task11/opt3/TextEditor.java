package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    JMenuBar menu = new JMenuBar();
    JMenu color = new JMenu("Color");
    JMenu font = new JMenu("Font");
    JTextArea textArea = new JTextArea();

    JMenuItem red = new JMenuItem("Red");
    JMenuItem green = new JMenuItem("Green");
    JMenuItem blue = new JMenuItem("Blue");

    JMenuItem times = new JMenuItem("Times New Roman");
    JMenuItem comic = new JMenuItem("Comic Sans");
    JMenuItem arial = new JMenuItem("Arial");

    TextEditor(){
        super("TextEditor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        textArea.setFont(new Font("times new roman", Font.BOLD, 18));
        textArea.setText("TeneT");
        setJMenuBar(menu);
        add(textArea);

        menu.add(color);
        color.add(red);
        color.add(green);
        color.add(blue);

        menu.add(font);
        font.add(times);
        font.add(comic);
        font.add(arial);

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(new Color(255, 0, 0));
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(new Color(48, 137, 24));
            }
        });
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(new Color(0, 173, 203, 200));
            }
        });

        times.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("times new roman", Font.BOLD, 18) );
            }
        });
        comic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("comic sans ms", Font.BOLD, 18) );
            }
        });
        arial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("arial", Font.ITALIC, 18) );
            }
        });
    }
    public static void main(String[] args) {
        new TextEditor().setVisible(true);
    }
}
