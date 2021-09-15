package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        c1.setRadius(25);
        System.out.println(c1);
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getRadius());
        c1.scaleCircle(2);
        System.out.println(c1);
    }
}
