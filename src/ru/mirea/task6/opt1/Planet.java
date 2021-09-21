package ru.mirea.task6.opt1;

public class Planet implements Nameable {
    private String name;
    private double mass, volume;

    public Planet(String name, double mass, double volume) {
        this.name = name;
        this.mass = mass;
        this.volume = volume;
    }

    @Override
    public String getName() {
        return name;
    }
}
