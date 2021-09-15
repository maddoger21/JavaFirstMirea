package ru.mirea.task2.opt4;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Semen", 3);
        Dog d2 = new Dog("Carl", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
