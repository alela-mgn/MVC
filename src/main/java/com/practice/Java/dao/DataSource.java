package com.practice.Java.dao;

import com.practice.Java.model.Watch;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private static DataSource ourInstance = new DataSource();

    public static DataSource getInstance() {
        return ourInstance;
    }

    private List<Watch> list = new ArrayList<>() {{
        add(new Watch("черный", 3990, "13-03-2022", "кварцевые"));
        add(new Watch("белый", 5590, "13-03-2022", "кварцевые"));
        add(new Watch("красный", 3990, "15-03-2022", "кварцевые"));
        add(new Watch("желтый", 4290, "12-03-2022", "цифровые"));
        add(new Watch("зеленый", 6490, "14-03-2022", "цифровые"));
        add(new Watch("серый", 8730, "12-03-2022", "механические"));
        add(new Watch("голубой", 7890, "11-03-2022", "механические"));
    }};

    public List<Watch> getWatch() {
        return list;
    }

    public void setWatch(List<Watch> list) {
        this.list = list;
    }
}
