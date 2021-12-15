package ru.mirea.task20;

import ru.mirea.task20.example.TimeZoneExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    Date date = null;
    private  final  String  DATETIME_format = "HH:mm";
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        date = new Date();

        DateFormat df = new SimpleDateFormat(DATETIME_format);
        String dateNow = df.format(date);

        if (dateNow.equals("07:00")) {
            System.out.println("Time for breakfast!");
        }
        if(dateNow.equals("13:00"))
            System.out.println("Time for dinner!");
        if(dateNow.equals("19:00"))
            System.out.println("Time for supper");
        System.out.println (dateNow);
    }
}
