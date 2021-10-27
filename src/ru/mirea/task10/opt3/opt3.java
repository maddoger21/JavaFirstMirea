package ru.mirea.task10.opt3;

import java.util.Scanner;

public class opt3 {

    public static void recursion(int a, int b) {
        if (a < b){
            System.out.println(a + " ");
            recursion(a+1,b);
        }
        else if (a > b){
            System.out.println(a + " ");
            recursion(a-1,b);
        }
        else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        recursion(a,b);
    }
}
