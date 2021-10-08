package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head(8);
        Leg leg = new Leg(50);
        Hand hand = new Hand(40);
        Human human = new Human(head, leg, hand);

        System.out.println("Размер головы " +human.getHead().size);
        System.out.println("Длина ноги " + human.getHand().width);
        System.out.println("Ширина головы " +human.getLeg().length + '\n');

        Head head_2 = new Head(9);
        Leg leg_2 = new Leg(70);
        Hand hand_2 = new Hand(60);

        human.setHand(hand_2);
        human.setHead(head_2);
        human.setLeg(leg_2);

        System.out.println("Размер головы " +human.getHead().size);
        System.out.println("Длина ноги " + human.getHand().width);
        System.out.println("Ширина головы " +human.getLeg().length);
    }
}
