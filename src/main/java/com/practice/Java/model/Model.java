package com.practice.Java.model;

public interface Model {
    void getAllWatch();

    void sortByPrice();

    void sortByColor();

    void sortByDate();

    void getAllPrice();

    void addWatch(String color, int price, String date, String type);
}
