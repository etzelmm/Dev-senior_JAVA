package com.devsenior.students.eamolinam.bookservice.model;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean leido;

    public Book(){   
    }

    public Book(String isbn, String title, String author, boolean leido) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.leido = leido;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    
}
