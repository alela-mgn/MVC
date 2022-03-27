package com.practice.Java.model;
import com.practice.Java.dao.DataSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainModel implements Model {
    private DataSource dataSource = DataSource.getInstance();

    @Override
    public void getAllWatch() {
        List<Watch> watches = dataSource.getWatch();
        for (Watch list : watches) {
            System.out.println(list);
        }
    }

    @Override
    public void sortByPrice() {
        List<Watch> watches = dataSource.getWatch();
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getPrice));
        for (Watch list : watchesCopy) {
            System.out.println(list);
        }
    }

    @Override
    public void sortByColor() {
        List<Watch> watches = dataSource.getWatch();
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getColor));
        for (Watch list : watchesCopy) {
            System.out.println(list);
        }
        watchesCopy.clear();
    }

    @Override
    public void sortByDate() {
        List<Watch> watches = dataSource.getWatch();
        List<Watch> watchesCopy = new ArrayList<>(watches);
        watchesCopy.sort(Comparator.comparing(Watch::getDate));
        for (Watch list : watchesCopy) {
            System.out.println(list);
        }
        watchesCopy.clear();
    }

    @Override
    public void getAllPrice() {
        int sum = 0;
        List<Watch> watches = dataSource.getWatch();
        List<Watch> watchesCopy = new ArrayList<>(watches);
        for (Watch list : watchesCopy) {
            sum = sum + list.getPrice();
        }
        System.out.println(sum);
        watchesCopy.clear();
    }

    @Override
    public void addWatch(String color, int price, String date, String type) {
        List<Watch> watches = dataSource.getWatch();
        watches.add(new Watch(color, price, date, type));
    }
}
