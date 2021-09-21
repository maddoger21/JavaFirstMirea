package ru.mirea.task3.opt2;

public class Head {
    private boolean hasHair;
    private String hairColor;
    private boolean hasBeard;
    private String eyeColor;

    public Head(boolean hasHair, String hairColor, boolean hasBeard, String eyeColor) {
        this.hasHair = hasHair;
        this.hairColor = hairColor;
        this.hasBeard = hasBeard;
        this.eyeColor = eyeColor;
    }
    public Head(boolean hasHair, boolean hasBeard, String eyeColor) {
        this.hasHair = hasHair;
        this.hasBeard = hasBeard;
        this.eyeColor = eyeColor;
    }
    public void changeHairColor(String hairColor){
        this.hairColor = hairColor;
    }
    public void growBeard(){
        this.hasBeard = true;
    }
    public void shave(){
        this.hasBeard = false;
    }
    public void haircut(){
        this.hasHair = false;
    }
    public void growHair(){
        this.hasHair = true;
    }

    @Override
    public String toString() {
        return ((hasHair == true)?"The Head has " + hairColor + " hair, " :"Head without hair, ") +
                "face " + ((hasBeard == true)?"with beard ": "without beard ") +
                "and " + eyeColor + " eyes.";
    }
}
