package com.demo.streamAPI;

public class Book {

    private String auther;
    private String title;

    public Book(String auther, String title) {
        this.auther = auther;
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "com.demo.streamAPI.Book{" +
                "auther='" + auther + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
