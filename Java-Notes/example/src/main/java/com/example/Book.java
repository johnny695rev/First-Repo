package com.example;

public class Book {
    /*
     * Java Bean design pattern:
     *  all fields must be private
     *  all fields must have getter and setter methods    
     */

    private String title;
    private String author;
    private String genre;
    private int isbn;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    
}
