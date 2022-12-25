package com.practice.Java.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Watch {
    private Color color;
    private BigDecimal price;
    private LocalDate date;
    private Type type;

    public Watch(Color color, BigDecimal price, LocalDate date, Type type) {
        this.color = color;
        this.price = price;
        this.date = date;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
