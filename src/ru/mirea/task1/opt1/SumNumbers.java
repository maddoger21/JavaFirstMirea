package ru.mirea.task1.opt1;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int size;
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }
        int sumFor=0;
        for (int i = 0; i < size; i++){
            sumFor+=array[i];
        }
        System.out.println("Сумма чисел массива с помощью цикла For: " + sumFor);
        int count = 0, sumWhile = 0;
        while (count != size){
            sumWhile+=array[count];
            count++;
        }
        System.out.println("Сумма чисел массива с помощью цикла While: " + sumWhile);
        count = 0;
        int sumDoWhile = 0;
        do{
            if (size > 0) {
                sumDoWhile += array[count];
                count++;
            }
            else {
                break;
            }
        }
        while(count != size);
        System.out.println("Сумма чисел массива с помощью цикла DoWhile: " + sumDoWhile);
    }
}
