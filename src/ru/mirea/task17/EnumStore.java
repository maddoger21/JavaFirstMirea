package ru.mirea.task17;

enum Store{
    Apple(10,50,10,20), Cake(40, 5, 15, 40), Pizza(30,5, 25, 35),
    Cola(5, 0, 0, 10), Pepsi(5, 0, 0, 11), Carrot(3, 15, 5, 2),
    Cucumber(6, 20, 3, 3);

    private int price;
    private int health;
    private int hungry;
    private int energy;

    Store(int price,int health,int hungry,int energy){
        this.price = price;
        this.health = health;
        this.hungry = hungry;
        this.energy = energy;
    }

    public int getPrice() {
        return price;
    }

    public int getHealth() {
        return health;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }
}

public class EnumStore {
    public static void main(String[] args) {

        System.out.println("\nМагазин продуктов:");
        for (Store a : Store.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " реалов, восполняет " + a.getHealth() + " здоровья, " + a.getEnergy() +
                    " энергии, " +a.getHungry() + " голода");
        }

    }


}
