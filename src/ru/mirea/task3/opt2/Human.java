package ru.mirea.task3.opt2;

public class Human {
    protected Head head;
    protected Leg leg;
    protected Hand hand;
    public Human(Head h, Leg l, Hand he) {
        this.head = h;
        this.leg = l;
        this.hand = he;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}

class Head{
    protected int size;

    public Head(int size) {
        this.size = size;
    }
}

class Leg{
    protected int length;

    public Leg(int length) {
        this.length = length;
    }
}

class Hand{
    protected int width;

    public Hand(int width) {
        this.width = width;
    }
}
