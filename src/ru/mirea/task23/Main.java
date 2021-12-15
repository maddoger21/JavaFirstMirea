package ru.mirea.task23;

public class Main {
    public static void main(String[] args) {
        Food Apple = new Food("Apple", 5, 5, 5,5);
        Food Coffee = new Food("Coffee", 25, 0, 0, 25);
        Food Fish = new Food("Fish", 2, 10 ,12, 15);
        Food Juice = new Food("Juice", 15, 0 , 0, 10);
        Food Cappuccino = new Food("Coffee", 25, 0, 0, 25);

        System.out.println("Объекты :\n\tApple = " + Apple +
                                    "\n\tCoffee = " + Coffee +
                                    "\n\tFish = " + Fish +
                                    "\n\tJuice = " + Juice +
                                    "\n\tCappuccino = " + Cappuccino);

        System.out.println("hashCode объектов :\n\tApple.hashCode = " + Apple.hashCode() +
                "\n\tCoffee.hashCode = " + Coffee.hashCode() +
                "\n\tFish.hashCode = " + Fish.hashCode() +
                "\n\tJuice.hashCode = " + Juice.hashCode() +
                "\n\tCappuccino.hashCode = " + Cappuccino.hashCode());

        System.out.println("Сравнение объектов :\n\tApple.equals(Coffee) = " + Apple.equals(Coffee) +
                "\n\tApple.equals(Fish) = " + Apple.equals(Fish) +
                "\n\tApple.equals(Juice) = " + Apple.equals(Juice) +
                "\n\tApple.equals(Cappuccino) = " + Apple.equals(Cappuccino) +
                "\n\tCoffee.equals(Fish) = " + Coffee.equals(Fish) +
                "\n\tCoffee.equals(Juice) = " + Coffee.equals(Juice) +
                "\n\tCoffee.equals(Cappuccino) = " + Coffee.equals(Cappuccino) +
                "\n\tFish.equals(Juice) = " + Fish.equals(Juice) +
                "\n\tFish.equals(Cappuccino) = " + Fish.equals(Cappuccino) +
                "\n\tJuice.equals(Cappuccino) = " + Juice.equals(Cappuccino));

    }
}
