package ru.mirea.task27.opt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("Лондон", "Британия"),
                new City("Париж", "Франция"),
                new City("Нью-Йорк", "США"),
                new City("Берлин", "Германия"),
                new City("Токио", "Япония"),
                new City("Рим", "Италия"),
                new City("Москва", "Россия")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();

        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
