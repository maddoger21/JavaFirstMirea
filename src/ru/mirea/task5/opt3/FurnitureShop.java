package ru.mirea.task5.opt3;

import java.util.ArrayList;

public class FurnitureShop {
    public static void main(String[] args) {
        ArrayList<Bed> beds = new ArrayList<>();
        ArrayList<Chair> chairs = new ArrayList<>();
        ArrayList<Shelf> shelves = new ArrayList<>();
        ArrayList<Table> tables = new ArrayList<>();
        beds.add(new Bed(12000, "tree" ));
        beds.add(new Bed(5000, "metal"));
        beds.add(new Bed(7000, "combined"));
        chairs.add(new Chair(1200, "tree"));
        chairs.add(new Chair("kitchen", 3000, "metal"));
        shelves.add(new Shelf(5000, "tree"));
        shelves.add(new Shelf(2000, "tree"));
        tables.add(new Table(2000, "tree"));
        tables.add(new Table(1000, "metal"));

        System.out.println("У нас в продаже есть: ");
        System.out.println("Кровати");
        for(int i= 0; i < beds.size(); i++){
            System.out.println(beds.get(i));
        }
        System.out.println("Стулья");
        for(int i= 0; i < chairs.size(); i++){
            System.out.println(beds.get(i));
        }
        System.out.println("Полки");
        for(int i= 0; i < shelves.size(); i++){
            System.out.println(beds.get(i));
        }
        System.out.println("Столы");
        for(int i= 0; i < tables.size(); i++){
            System.out.println(beds.get(i));
        }
    }
}
