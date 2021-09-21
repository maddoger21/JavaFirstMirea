package ru.mirea.task5.opt1;

public class Plate extends Dish {
    private String type;
    private int size;

    public Plate(String material, String color, String type, int size) {
        super(material, color);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "This plate has " + size + " cm size, " + "made for " + type  + ", made of " + getMaterial() + ", its color - " + getColor();
    }
}
