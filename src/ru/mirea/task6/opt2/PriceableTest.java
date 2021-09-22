package ru.mirea.task6.opt2;

public class PriceableTest {
    public static void main(String[] args) {
        Car c1 = new Car("Lada", 5000000);
        System.out.println(c1.getPrice());
        Dish d1 = new Dish("Spoon", "metal", 200);
        System.out.println(d1.getPrice());
        Laptop l1 = new Laptop("MSI 9RCX", 50000);
        System.out.println(l1.getPrice());
    }
}
