package ru.mirea.task5.opt2;

public class DogTest {
    public static void main(String[] args) {
        Shepard s1 = new Shepard("Rex", 7);
        Poodle p1 = new Poodle("Yana");
        Pug pug1 = new Pug("Semen", 5);
        System.out.println(s1);
        System.out.println(p1);
        System.out.println(pug1);
        s1.intoHumanAge();
        pug1.intoHumanAge();
    }
}
