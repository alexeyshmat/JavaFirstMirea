package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FigurePrint extends JPanel{
    public void paintComponent(Graphics p){
        this.setBackground(Color.gray);

        Random random = new Random();
        int temp, temp_xPos, temp_yPos;
        for(int i = 0; i < 20; i++){
            temp = random.nextInt(3)+1;
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);

            temp_xPos = random.nextInt(800)+1;
            temp_yPos = random.nextInt(600)+1;

            switch(temp){
                case 1:
                    Shape obj = new Circle(new Color(red,green,blue, 70), temp_xPos, temp_yPos);
                    p.setColor(obj.color);
                    p.fillOval(obj.xPos, obj.yPos, ((Circle) obj).radius, ((Circle) obj).radius);
                    break;
                case 2:
                    Shape obj_2 = new Rectangle(new Color(red,green,blue,70), temp_xPos, temp_yPos);
                    p.setColor(obj_2.color);
                    p.fillRect(obj_2.xPos, obj_2.yPos, ((Rectangle) obj_2).width, ((Rectangle) obj_2).length);
                    break;
                case 3:
                    Shape obj_3 = new Square(new Color(red,green,blue, 70), temp_xPos, temp_yPos);
                    p.setColor(obj_3.color);
                    p.fillRect(obj_3.xPos, obj_3.yPos, ((Square) obj_3).side, ((Square) obj_3).side);
                    break;
            }
        }
    }

}
