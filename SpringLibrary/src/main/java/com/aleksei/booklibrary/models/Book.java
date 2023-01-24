package com.aleksei.booklibrary.models;

import javax.validation.constraints.*;

public class Book {
    private int id;
    @NotEmpty(message = "Name of book should be not empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100 characters")
    private String title;
    @NotEmpty(message = "Author name not should be empty")
    @Size(min = 2, max = 30, message = "Author name should be beetwen 2 and 30 characters")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+}", message = "Author should be in this format: First name Last Name")
    private String author;
    @Min(value = 1000, message = "Year should be not less than 900")
    private int year;
    public Book(){}

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
