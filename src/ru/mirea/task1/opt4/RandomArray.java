package ru.mirea.task1.opt4;

public class RandomArray {
    public static void main(String[] args) {
        int size = (int) (1 + Math.random()*15);
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random()*200 - 100); // -100 do 100
        }
        System.out.println("Сгенерирован массив размером " + size);
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < size-1; i++){
            for (int j = i+1; j < size; j ++){
                int temp = array[j];
                if (array[j] < array[i]){
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив: " + '\n');
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
