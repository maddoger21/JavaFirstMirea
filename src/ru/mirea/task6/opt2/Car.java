package ru.mirea.task6.opt2;

public class Car implements Priceable{
    String model;
    double cost;

    public Car(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
