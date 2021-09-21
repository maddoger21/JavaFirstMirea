package ru.mirea.task6.opt1;

public class Dog  implements Nameable{
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }
}
