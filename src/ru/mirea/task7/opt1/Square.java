package ru.mirea.task7.opt1;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + length;
    }
}
