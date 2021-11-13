package ru.mirea.task11.opt2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Boundaries extends JFrame {

    JLabel l_w = new JLabel("WEST", SwingConstants.CENTER);
    JLabel l_e = new JLabel("EAST", SwingConstants.CENTER);
    JLabel l_s = new JLabel("SOUTH", SwingConstants.CENTER);
    JLabel l_n = new JLabel("NORTH", SwingConstants.CENTER);
    JLabel l_c = new JLabel("CENTER", SwingConstants.CENTER);

    Boundaries(){
        super("Boundaries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        l_w.setPreferredSize(new Dimension(100, 100));
        l_e.setPreferredSize(new Dimension(100, 100));
        l_s.setPreferredSize(new Dimension(100, 50));
        l_n.setPreferredSize(new Dimension(100, 50));
        l_c.setPreferredSize(new Dimension(100, 100));

        Border border = BorderFactory.createLineBorder(Color.ORANGE);
        l_w.setBorder(border);
        l_e.setBorder(border);
        l_s.setBorder(border);
        l_n.setBorder(border);
        l_c.setBorder(border);

        add(l_w, BorderLayout.WEST);
        add(l_e, BorderLayout.EAST);
        add(l_s, BorderLayout.SOUTH);
        add(l_n, BorderLayout.NORTH);
        add(l_c, BorderLayout.CENTER);

        l_w.setToolTipText("Добро пожаловать на Запад.");
        l_e.setToolTipText("Добро пожаловать на Восток.");
        l_s.setToolTipText("Добро пожаловать на Юг.");
        l_n.setToolTipText("Добро пожаловать на Север.");
        l_c.setToolTipText("Добро пожаловать в Центр.");
    }
    public static void main(String[] args) {
        new Boundaries().setVisible(true);

    }
}

