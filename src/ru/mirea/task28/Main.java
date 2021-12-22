package ru.mirea.task28;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche", new Car.Engine(291),
                new Car.Door[]{new Car.Door(false),
                        new Car.Door(false),
                        new Car.Door(false),
                        new Car.Door(false)});
        car1.openDoor(2);
        car1.closeDoor(1);
        car1.start();
    }
}
