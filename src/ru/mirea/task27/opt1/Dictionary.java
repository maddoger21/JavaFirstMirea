package ru.mirea.task27.opt1;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        Scanner in = new Scanner(System.in);
        names.put("Сергеев", "Антон");
        names.put("Иванов", "Петя");
        names.put("Стаханов", "Жора");
        names.put("Сталин", "Иосиф");
        names.put("Куриев", "Жора");
        names.put("Соколов", "Паша");
        names.put("Воробьев", "Станислав");
        names.put("Пошеченков", "Антон");
        names.put("Перфильев", "Паша");
        names.put("Кинг", "Стивен");

        Collection<String> list = names.values();
        for(Iterator<String> iter = list.iterator(); iter.hasNext();)
        {
            if(Collections.frequency(list, iter.next())>1)
            {
                iter.remove();
            }
        }

        System.out.printf("Словарь: %s%n", names);
    }
}
