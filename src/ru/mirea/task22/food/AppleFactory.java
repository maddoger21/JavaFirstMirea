package ru.mirea.task22.food;

public class AppleFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Apple();
    }
}
