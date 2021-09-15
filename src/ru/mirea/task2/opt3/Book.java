package ru.mirea.task2.opt3;

public class Book {
    private String name;
    private String author;
    private String genre;

    public Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.genre = "Unknown genre";
    }

    public Book(String name) {
        this.name = name;
        this.genre = "Unknown genre";
        this.author = "Unknown author";
    }
    public Book(){
        this.name = "Unknown name";
        this.genre = "Unknown genre";
        this.author = "Unknown author";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Author " + author + " wrote a book with title - " + name + ", genre - " + genre;
    }

    public void read(){
        System.out.println("Book with title - " + name + " - was read");
    }
}
