package ru.mirea.task1.opt5;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Факториал числа");
        System.out.print("Введите неотрицательное число: ");
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        int factorial = 1;
        for (int i = number; i > 0; i--){
            factorial*=i;
        }
        System.out.println("Его факториал равен: " + factorial);
    }
}
