package ru.mirea.task18;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Service {

    public static void main(String[] args) {
        new DecreasingStatus().start();
    }

    public static class DecreasingStatus extends Thread{
        Character character = new Character("Karl",100,100,100);
        @Override
        public void run() {
            while (
                    character.getEnergy() > 0 || character.getHealth() > 0 || character.getHungry() > 0) {
                character.setEnergy(character.getEnergy() - 1);
                character.setHealth(character.getHealth() - 1);
                character.setHungry(character.getHungry() - 1);
                System.out.println(character.getEnergy() + " " +
                        character.getHealth() + " " +
                        character.getHungry());

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
