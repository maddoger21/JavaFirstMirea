package ru.mirea.task7.opt2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    public boolean isEqualSpeed(){
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        }
        else
            return false;
    }

    @Override
    public void moveUp() {
        this.topLeft.y+=this.topLeft.ySpeed;
        this.bottomRight.y+=this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y-=this.topLeft.ySpeed;
        this.bottomRight.y-=this.bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x-=this.topLeft.xSpeed;
        this.bottomRight.x-=this.bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x+=this.topLeft.xSpeed;
        this.bottomRight.x+=this.bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "Прямоугольник сс левой верхней точкой (" + topLeft.x + " , " + topLeft.y + ")"
                + " и нижней правой точкой (" + bottomRight.x + " , " + bottomRight.y + ")";
    }

}
