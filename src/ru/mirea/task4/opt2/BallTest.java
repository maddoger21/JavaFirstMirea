package ru.mirea.task4.opt2;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(25, 3.0);
        System.out.println(b1);
        b1.move(0.5, 100);
        System.out.println(b1);
    }
}
