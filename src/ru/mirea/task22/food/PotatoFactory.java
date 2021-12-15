package ru.mirea.task22.food;

public class PotatoFactory implements IFoodFactory {
    @Override
    public IFood Create() {
        return new Potato();
    }
}
