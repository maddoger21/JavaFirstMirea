package ru.mirea.task2.opt3;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("The Adventures of Tom Sawyer", "Mark Twain", "novel");
        book1.read();
        System.out.println(book1);
        Book book2 = new Book();
        book2.read();
        System.out.println(book2);
        book2.setAuthor("Jora");
        System.out.println(book2);
    }
}
