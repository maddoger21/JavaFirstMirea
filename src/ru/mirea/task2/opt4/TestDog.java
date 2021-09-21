package ru.mirea.task2.opt4;

import java.util.ArrayList;

public class TestDog {
    private static ArrayList <Dog> dogs = new ArrayList<>();

    public static void  addDogs(ArrayList <Dog> newDogs){
        dogs.addAll(newDogs);
    }
}
