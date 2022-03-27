package com.practice.Java.model;

public class Watch {
    private String color;
    private int price;
    private String date;
    private String type;

    public Watch(String color, int price, String date, String type) {
        this.color = color;
        this.price = price;
        this.date = date;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
