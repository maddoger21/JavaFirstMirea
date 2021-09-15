package ru.mirea.task2.opt1;

public class Shape {
    private String type;
    private double radius=0, length=0, width=0;

    public Shape(String type) {
        this.type = type;
    }

    public Shape(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }
    public Shape(String type, double length, double width) {
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void getSquare(){
        if (radius == 0 && length!= 0){
            System.out.println("Фигура типа '" + type + "' имеет площадь " + length*width);
        }
        else  if (length == 0 && width == 0 && radius != 0){
            System.out.println("Фигура типа '" + type + "' имеет площадь " + Math.PI*radius*radius);
        }
        else System.out.println("Фигура типа '" + type + "' невозможно найти площадь");
    }

    @Override
    public String toString() {
        if (radius == 0 && length!= 0){
            return "Фигура типа '" + type + "' имеет длину " + length + " и ширину " + width;
        }
        else  if (length == 0 && width == 0 && radius != 0){
            return "Фигура типа '" + type + "' имеет радиус " + radius;
        }
        else
            return "Фигура типа '" + type + "'";
    }
}
