package ru.mirea.task12.opt1;

import java.util.Scanner;

public class opt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student listOfStudent[] = new Student[n];
        InputList input = new InputList();
        input.input(listOfStudent, n);
    }
}
