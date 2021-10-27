package ru.mirea.task10.opt5;

import java.util.Scanner;

public class opt5 {
    public static int recurs(int n){
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recurs(n / 10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(recurs(n));
    }
}
