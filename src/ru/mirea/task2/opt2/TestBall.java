package ru.mirea.task2.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Black", 1, 3);
        Ball b2 = new Ball("White", 2);
        Ball b3 = new Ball(3);
        b2.setSize(5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.throwUp();
        b2.repainting("Yellow");
        System.out.println(b2);
    }
}
