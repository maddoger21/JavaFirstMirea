package ru.mirea.task6.opt1;

public class NameableTest {
    public static void main(String[] args) {
        Human h1 = new Human("John", 24);
        Dog d1 = new Dog ("Rex", "shepard", 7);
        Planet p1 = new Planet("Mars", 6.4, 1.6);
        System.out.println("Name of " +
                '\n' + "human - " + h1.getName() +
                '\n' + "dog - " + d1.getName() +
                '\n' + "planet - " + p1.getName());
    }
}
