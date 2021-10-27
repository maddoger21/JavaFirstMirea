package ru.mirea.task10.opt6;

import java.util.Scanner;

public class opt6 {

    public static boolean recurs(int n, int i){
        if (n < 2){
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0){
            return false;
        }
        else if (i < n/2){
            return recurs(n, i + 1);
        }
        else
            return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (recurs(n,2)){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
