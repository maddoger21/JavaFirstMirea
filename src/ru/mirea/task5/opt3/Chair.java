package ru.mirea.task5.opt3;

public class Chair extends Furniture {
    public Chair(String type, double cost, String material) {
        super(type, cost, material);
    }

    public Chair(double cost, String material) {
        super(cost, material);
    }

}
