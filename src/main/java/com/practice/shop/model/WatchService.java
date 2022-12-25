package com.practice.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface WatchService {

    List<Watch> getAllWatch();

    List<Watch> sortByPrice();

    List<Watch> sortByColor();

    List<Watch> sortByDate();

    BigDecimal getAllPrice();

    void addWatch(Color color, BigDecimal price, LocalDate date, Type type);
}
