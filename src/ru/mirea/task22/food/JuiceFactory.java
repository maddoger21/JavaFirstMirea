package ru.mirea.task22.food;

public class JuiceFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Juice();
    }
}
