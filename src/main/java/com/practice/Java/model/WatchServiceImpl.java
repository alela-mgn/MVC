package com.practice.Java.model;

import com.practice.Java.dao.DataSource;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WatchServiceImpl implements WatchService {
    private final List<Watch> watches = DataSource.getInstance().getWatch();

    @Override
    public List<Watch> getAllWatch() {
        return Collections.unmodifiableList(watches);
    }

    @Override
    public List<Watch> sortByPrice() {
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getPrice));
        return watchesCopy;
    }

    @Override
    public List<Watch> sortByColor() {
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getColor));
        return watchesCopy;
    }

    @Override
    public List<Watch> sortByDate() {
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getDate));
        return watchesCopy;
    }

    @Override
    public BigDecimal getAllPrice() {
        List<Watch> watchesCopy = new ArrayList<>(watches);
        return watchesCopy.stream().map(Watch::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public void addWatch(Color color, BigDecimal price, LocalDate date, Type type) {
        watches.add(new Watch(color, price, date, type));
    }
}
