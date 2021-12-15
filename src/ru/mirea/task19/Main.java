package ru.mirea.task19;

import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter character name: ");
        try {
            getName();
            System.out.println("Good name!");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static String getName() throws IOException {
        Scanner in = new Scanner(System.in);
        String name = null;
        name = in.nextLine();
        if (name.matches(".*\\d.*")){
            throw new IOException("String can not contain numbers!");
        }
        return name;
    }
}
