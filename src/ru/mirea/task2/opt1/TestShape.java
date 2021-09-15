package ru.mirea.task2.opt1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("Circle" , 15);
        System.out.println(s1);
        Shape s2 = new Shape("Square", 10, 10);
        System.out.println(s2);
        Shape s3 = new Shape("Shape");
        System.out.println(s3);
        s2.getSquare();
        s1.getSquare();
    }

}
