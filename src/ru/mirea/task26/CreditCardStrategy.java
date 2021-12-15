package ru.mirea.task26;

import java.util.Scanner;

public class CreditCardStrategy implements Strategy {
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
        System.out.println("Укажите тип карты: ");
        String type = in.nextLine();
        System.out.println("Введите ее номер: ");
        String number, date, name, cvv;
        number = in.nextLine();
        System.out.println("Введите срок действия: ");
        date = in.nextLine();
        System.out.println("Введите имя владельца: ");
        name = in.nextLine();
        System.out.println("Укажите CVV-код: ");
        cvv = in.nextLine();
    }
}
