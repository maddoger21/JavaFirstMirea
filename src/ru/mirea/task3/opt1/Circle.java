package ru.mirea.task3.opt1;

public class Circle {
    private double x,y,r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.r = 1.0;
    }

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public void scaleCircle(double k){
        this.r *= k;
    }
    public void moveCircle(double x, double y){
        this.x +=x;
        this.y +=y;
    }
    public double getSquare(){
        return Math.PI * r * r;
    }
    public double getLength(){
        return 2*Math.PI*r;
    }
    public boolean equalsCircle(Circle cir){
        if(this.getSquare() == cir.getSquare()) {
            return true;
        }
        return false;
    }
    public void setRandomCenter(){
        this.x = Math.random()*200 - 100;
        this.y = Math.random()*200 - 100;
    }
    public void setRandomRadius(){
        this.r = Math.random()*200 - 100;
    }
    public void setRandomCircle(){
        this.x = Math.random()*200 - 100;
        this.y = Math.random()*200 - 100;
        this.r = Math.random()*200 - 100;
    }

    @Override
    public String toString() {
        return "Окружность с центром в " +
                "x = " + x +
                ", y = " + y +
                " и радиусом r = " + r;
    }
}
