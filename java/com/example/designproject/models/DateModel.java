package com.example.designproject.models;
public class DateModel {
    int day;
    String dayOfWeek;

    public DateModel(int day, String dayOfWeek) {
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public int getDay() {
        return day;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

}
