package ru.mirea.task9.opt1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame {
    JButton button_milan = new JButton("Milan");
    JButton button_madrid = new JButton("Madrid");
    JLabel result = new JLabel();
    JLabel lastScorer = new JLabel();
    Label winner = new Label();
    JPanel[] panel = new JPanel[9];

    private int milanScore;
    private int madridScore;

    public Score()
    {
        super("Score");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,3));
        for(int i = 0 ; i < panel.length ; i++)
        {
            panel[i] = new JPanel();
            add(panel[i]);
        }
        
        panel[3].setLayout(new BorderLayout());
        panel[5].setLayout(new BorderLayout());
        panel[3].add(button_milan);
        panel[5].add(button_madrid);
        panel[1].add(winner);
        panel[4].add(result);
        panel[7].add(lastScorer);
        result.setText(0+" X "+0);

        ActionListener button = new buttonAction();
        button_milan.setActionCommand("Milan");
        button_madrid.setActionCommand("Madrid");
        button_milan.addActionListener(button);
        button_madrid.addActionListener(button);
    }

    public class buttonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ("Milan".equals(e.getActionCommand())) {
                milanScore++;
            } else {
                madridScore++;
            }
            result.setText("Result: " + milanScore + " X " + madridScore);
            lastScorer.setText("Last Scorer: " + e.getActionCommand());
            if(milanScore > madridScore){
                winner.setText("Winner: " + button_milan.getActionCommand());
            }else if(milanScore == madridScore){
                winner.setText("DRAW");
            }else{
                winner.setText("Winner: " + button_madrid.getActionCommand());
            }
        }
    }

    public static void main(String[]args)
    {
        new Score().setVisible(true);
    }
}
