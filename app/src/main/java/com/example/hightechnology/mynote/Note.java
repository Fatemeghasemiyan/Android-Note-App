package com.example.hightechnology.mynote;

import java.util.Date;

public class Note {
    private String title;
    private String description;
    private long date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return new Date(date).toString();
    }

    public void setDate(long date) {
        this.date = date;
    }
}
