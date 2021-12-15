package ru.mirea.task22.food;

public class PizzaFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Pizza();
    }
}