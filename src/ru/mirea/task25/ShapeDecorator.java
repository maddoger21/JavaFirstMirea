package ru.mirea.task25;

public abstract class ShapeDecorator implements Shape {
    public final Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
