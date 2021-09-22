package ru.mirea.task5.opt3;

public abstract class Furniture {
    String type;
    double cost;
    String material;

    public Furniture(String type, double cost, String material) {
        this.type = type;
        this.cost = cost;
        this.material = material;
    }

    public Furniture(double cost, String material) {
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        if(type == null)
            return "Стоимость " + cost + " изготовлен(a) из " + material;
        else
            return "Для " + type + " стоимостью " + cost + " изготовлен(а) из " + material;
    }
}
