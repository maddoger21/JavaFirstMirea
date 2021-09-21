package ru.mirea.task3.opt3;

public class Book {
    String author, name;
    int writingAge;
    String publishing;
    int pageCount;

    public Book(String author, String name, int writingAge, String publishing, int pageCount) {

        this.author = author;
        this.name = name;
        this.writingAge = writingAge;
        this.publishing = publishing;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWritingAge() {
        return writingAge;
    }

    public void setWritingAge(int writingAge) {
        this.writingAge = writingAge;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return author + ", " + name + " / " + author + "; " + publishing + " - " + pageCount + " pages";
    }
}
