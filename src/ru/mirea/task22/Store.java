package ru.mirea.task22;

import ru.mirea.task22.food.*;

import java.util.ArrayList;

public class Store {

    private static ArrayList<IFood> foodArrayList = new ArrayList();
    private static ArrayList<IFoodFactory> foodFactories = new ArrayList();

    public static void main(String[] args) {
        foodFactories.add(new AppleFactory());
        foodFactories.add(new CoffeeFactory());
        foodFactories.add(new FishFactory());
        foodFactories.add(new JuiceFactory());
        foodFactories.add(new PizzaFactory());
        foodFactories.add(new PotatoFactory());
        for(int i = 0; i < foodFactories.size(); i++){
            IFood iFood = foodFactories.get(i).Create();
            foodArrayList.add(iFood);
        }
        for(int i = 0; i < foodFactories.size(); i++){
            System.out.println(foodArrayList.get(i).getName() + " " + foodArrayList.get(i).getCost());
        }
    }
}
