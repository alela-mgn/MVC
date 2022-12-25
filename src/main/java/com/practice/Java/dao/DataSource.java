package com.practice.Java.dao;

import com.practice.Java.model.Color;
import com.practice.Java.model.Type;
import com.practice.Java.model.Watch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private final static DataSource ourInstance = new DataSource();

    public static DataSource getInstance() {
        return ourInstance;
    }

    private final List<Watch> list = new ArrayList<>();

    {
        list.add(new Watch(Color.BLACK, new BigDecimal(3990), LocalDate.of(2022, Month.MARCH, 13), Type.QUARTZ));
        list.add(new Watch(Color.WHITE, new BigDecimal(5590), LocalDate.of(2022, Month.MARCH, 13), Type.QUARTZ));
        list.add(new Watch(Color.RED, new BigDecimal(3990), LocalDate.of(2022, Month.MARCH, 15), Type.QUARTZ));
        list.add(new Watch(Color.YELLOW, new BigDecimal(4290), LocalDate.of(2022, Month.MARCH, 12), Type.DIGITAL));
        list.add(new Watch(Color.GREEN, new BigDecimal(6490), LocalDate.of(2022, Month.MARCH, 14), Type.DIGITAL));
        list.add(new Watch(Color.GRAY, new BigDecimal(11234), LocalDate.of(2022, Month.MARCH, 12), Type.MECHANICAL));
        list.add(new Watch(Color.BLUE, new BigDecimal(7890), LocalDate.of(2022, Month.MARCH, 11), Type.MECHANICAL));
    }

    public List<Watch> getWatch() {
        return list;
    }
}
