package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human(new Head(false, true, "blue"), new Leg(45, false, 101), new Hand("Right-handed"),
                "John", 26, "male");
        System.out.println(h1);
    }
}
