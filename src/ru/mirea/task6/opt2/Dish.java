package ru.mirea.task6.opt2;

public class Dish implements Priceable {
    String type;
    String material;
    double cost;

    public Dish(String type, String material, double cost) {
        this.type = type;
        this.material = material;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
