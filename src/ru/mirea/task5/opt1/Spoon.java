package ru.mirea.task5.opt1;

public class Spoon extends Dish{
    private int length;
    private String type;

    public Spoon(String material, String color, int length, String type) {
        super(material, color);
        this.length = length;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "This spoon has " + length + " cm length, " + "made for " + type  + ", made of " + getMaterial() + ", its color - " + getColor();
    }
}
