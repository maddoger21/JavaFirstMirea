package ru.mirea.task7.opt1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Окружность радиуса " + radius + ", имеет площадь " + getArea() + " и периметр " + getPerimeter();
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
