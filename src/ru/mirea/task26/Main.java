package ru.mirea.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order;
        System.out.print("Введите номер заказа: ");
        order = sc.next();

        System.out.println("Выберите способ оплаты: \n" +
                "1.Кредитная карта\n" +
                "2.Электронный кошелёк");

        int way;
        way = sc.nextInt();

        switch (way) {
            case 1 -> {
                Context context = new Context();
                context.setStrategy(new CreditCardStrategy());
                context.collectData();
                context.pay();
            }
            case 2 -> {
                Context context = new Context();
                context.setStrategy(new WalletStrategy());
                context.collectData();
                context.pay();
            }
            default -> System.out.print("Ошибка ввода");
        }

        System.out.println("Заказ \""+order+"\" успешно оплачен. Спасибо за покупку!");
    }
}
