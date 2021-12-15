package ru.mirea.task26;

import java.util.Scanner;

public class WalletStrategy implements Strategy{
    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        System.out.println("Проводится оплата...");
        System.out.println("На ваш номер телефона выслан код. Введите его для оплаты: ");
        String pass = in.nextLine();
        System.out.println("Оплата прошла успешно");
    }

    @Override
    public void collectData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер электронного кошелька: ");
        String number = in.nextLine();
    }
}
