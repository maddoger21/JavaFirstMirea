package ru.mirea.task10.opt4;

import java.util.Scanner;

public class opt4 {

    public static int recurs(int k, int s, int length, int sum){
        if (length == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
            int c = (length == 0 ? 1 : 0);
            int res = 0;
            for (int i = c; i < 10; i++) {
                res += recurs(k, s, length+1, sum+i);
            }
            return res;

    }

    public static void main(String[] args) {
        int k, s;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        s = in.nextInt();
        System.out.println(recurs(k,s,0,0));
    }
}
