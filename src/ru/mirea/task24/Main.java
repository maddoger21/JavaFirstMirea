package ru.mirea.task24;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean validateIP(String in) {
        return in.matches("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
    }

    public static void main(String[] args) {
        List IPs = new ArrayList();
        IPs.add("127.0.0.1");
        IPs.add("255.255.255.0");
        IPs.add("1300.6.7.8");
        IPs.add("abc.def.gha.bcd");

        for (Object a: IPs) {
            System.out.println(validateIP(a.toString()));
        }
    }
}
