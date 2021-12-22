package ru.mirea.task29;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        String strDate = "Wed, December 23, 2021";

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        Date date = getDate(strDate, formatter);
        CurrencyInfo curInfo = new CurrencyInfo(date);
        curInfo.addCurrency("AUD", 52.6788);
        curInfo.addCurrency("UAH", 27.0725);
        curInfo.addCurrency("JPY", 64.5554);
        curInfo.addCurrency("USD", 73.7901);

        FileOutputStream outputStream = new FileOutputStream("src/ru/mirea/task29/data.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(curInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/ru/mirea/task29/data.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.close();

        System.out.println(curInfo);
    }

    public static Date getDate(String strDate, SimpleDateFormat formatter)
    {
        Date date = new Date();
        try {
            date = formatter.parse(strDate);
        } catch (ParseException e)  {
            e.printStackTrace();
        }

        return date;
    }

}
