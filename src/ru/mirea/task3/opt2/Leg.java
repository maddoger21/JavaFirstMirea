package ru.mirea.task3.opt2;

public class Leg {
    private int footSize;
    private boolean isBrokenLeg;
    private int legLong;

    public Leg(int footSize, boolean isBrokenLeg, int legLong) {
        this.footSize = footSize;
        this.isBrokenLeg = isBrokenLeg;
        this.legLong = legLong;
    }
    public void brokeLeg(){
        isBrokenLeg = true;
    }
    public void changeFootSizeTo(int footSize){
        this.footSize = footSize;
    }
    public void changeLegLongTo(int legLong){
        this.legLong = legLong;
    }

    @Override
    public String toString() {
        return ((isBrokenLeg == true)?"Broken leg":"Leg") +
                " with " + footSize + " foot size and " +
                "leg has " + legLong + " cm long.";
    }
}
