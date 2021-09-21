package ru.mirea.task5.opt1;

public class Cup extends Dish{
    private int capacity;
    private boolean hasHandle;

    public Cup(String material, String color, int capacity, boolean hasHandle) {
        super(material, color);
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "This Cup made of " + getMaterial() + ", has color - " + getColor() + ", capacity - " + capacity + ", also this cup " + ((hasHandle)? "has handle": "hasn't handle");
    }
}
