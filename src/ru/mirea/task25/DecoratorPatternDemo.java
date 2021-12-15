package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);

        circle.draw();
        System.out.println();
        redShapeDecorator.draw();
    }
}
