package ru.mirea.task21;

import java.util.ArrayList;

public class Food <T>{
    private T t;


    public void setT(T t){
        this.t=t;

    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        Food<String> foodNames = new Food<>();
        foodNames.setT("Apple");
        System.out.println(foodNames.getT());
        foodNames.setT("Potato");
        System.out.println(foodNames.getT());
        Food<Integer> foodCosts = new Food<>();
        foodCosts.setT(10);
        System.out.println(foodCosts.getT());
        foodCosts.setT(5);
        System.out.println(foodCosts.getT());

    }
}
