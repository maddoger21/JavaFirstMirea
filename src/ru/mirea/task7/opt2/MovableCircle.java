package ru.mirea.task7.opt2;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.center.y+=this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y-=this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x-=this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x+=this.center.xSpeed;
    }
}
