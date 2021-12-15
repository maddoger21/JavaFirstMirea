package ru.mirea.task22.food;

public class FishFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Fish();
    }
}