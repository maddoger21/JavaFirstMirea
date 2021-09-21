package ru.mirea.task5.opt1;

public class DishTest {
    public static void main(String[] args) {
        Plate p1 = new Plate("tree", "brown", "snack", 30);
        System.out.println(p1);
        Spoon s1 = new Spoon("metal", "grey", 15, "soup");
        System.out.println(s1);
        Cup c1 = new Cup("glass", "light", 100, false);
        System.out.println(c1);
    }
}
