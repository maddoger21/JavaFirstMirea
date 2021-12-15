package ru.mirea.task22.food;

public class CoffeeFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Coffee();
    }
}
