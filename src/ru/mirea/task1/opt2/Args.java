package ru.mirea.task1.opt2;

public class Args {
    public static void main(String[] args) {
        System.out.print("Аргументы командной строки: ");
        for (int i =0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
    }
}
