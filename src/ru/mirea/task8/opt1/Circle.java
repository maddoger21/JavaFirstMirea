package ru.mirea.task8.opt1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double posx, double posy, double radius) {
        super(color, posx, posy);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
