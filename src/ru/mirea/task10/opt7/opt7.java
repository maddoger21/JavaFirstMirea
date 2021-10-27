package ru.mirea.task10.opt7;

import java.util.Scanner;

public class opt7 {
    public static void rec(int n, int k) {
        if (n == 1){
            return;
        }
        if (k > Math.sqrt(n)) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            while (n%k == 0)
                n/=k;
            rec(n , k);
        }
        else {
            rec(n, k+1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        rec(n, 2);
    }
}
