package ru.mirea.task3.opt2;

public class Hand {
    private String leadHand;

    public Hand(String leadHand) {
        this.leadHand = leadHand;
    }
    public void changeLeadHand(String leadHand){
        this.leadHand = leadHand;
    }

    @Override
    public String toString() {
        return leadHand + " human";
    }
}
