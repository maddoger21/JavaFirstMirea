package ru.mirea.task2.opt2;

public class Ball {
    private String colour;
    private int num;
    private int size;

    public Ball(String colour,int num, int size) {
        this.colour = colour;
        this.num = num;
        this.size = size;
    }

    public Ball(String colour, int num){
        this.colour = colour;
        this.num = num;
        this.size = 1;
    }
    public Ball(int num, int size){
        this.colour = "White";
        this.num = num;
        this.size = size;
    }

    public Ball(int num){
        this.colour = "White";
        this.num = num;
        this.size = 1;
    }

    public Ball(){
        this.colour = "White";
        this.num = 0;
        this.size = 1;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball " + num + " has" +
                " colour=" + colour +
                ", size=" + size;
    }

    public void repainting(String colour){
        System.out.println("The ball " + num + " was repainted " + colour);
        this.colour = colour;
    }

    public void throwUp() {
        System.out.println("The ball " + num + " was thrown up");
    }
}
