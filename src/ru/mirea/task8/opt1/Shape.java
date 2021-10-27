package ru.mirea.task8.opt1;

public abstract class Shape {
    protected String color;
    protected double posx;
    protected double posy;

    public Shape() {

    }

    public Shape(String color, double posx, double posy) {
        this.color = color;
        this.posx = posx;
        this.posy = posy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }
}
