package ru.mirea.task3.opt2;

public class Human {
    Head head;
    Leg leg;
    Hand hand;
    String name;
    int age;
    String gender;

    public Human(Head head, Leg leg, Hand hand, String name, int age, String gender) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Characteristics of this human: " + head + " " + leg + " " + hand +
                ". Name is " + name + ", age is " + age + ", gender is " + gender;
    }
}
