package com.practice.Java.controller;

import com.practice.Java.model.Color;
import com.practice.Java.model.Type;
import com.practice.Java.model.Watch;
import com.practice.Java.model.WatchServiceImpl;
import com.practice.Java.view.UserView;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static com.practice.Java.view.Constants.*;

public class Controller {
    private final UserView view;
    private final WatchServiceImpl model;

    public Controller(UserView view, WatchServiceImpl mainModel) {
        this.view = view;
        this.model = mainModel;
    }

    public void run() {
        view.printMessage(MAIN_MENU_MESSAGE);
        String input = view.input();
        while (!input.equalsIgnoreCase(QUIT_COMMAND)) {
            switch (input) {
                case LIST_ALL_WATCHES_COMMAND:
                    print(model.getAllWatch());
                    break;
                case SORT_BY_PRICE_COMMAND:
                    print(model.sortByPrice());
                    break;
                case SORT_BY_COLOR_COMMAND:
                    print(model.sortByColor());
                    break;
                case SORT_BY_DATE_COMMAND:
                    print(model.sortByDate());
                    break;
                case GET_SUM_PRICE_COMMAND:
                    view.printMessage(model.getAllPrice().toString());
                    break;
                case ADD_NEW_WATCHES_COMMAND:
                    addNewWatch();
                    break;
            }
            input = view.input();
        }
    }

    private void addNewWatch() {
        Color color = Color.valueOf(view.input().toUpperCase());
        BigDecimal price = new BigDecimal(view.input());
        LocalDate date = LocalDate.parse(view.input().trim());
        Type type = Type.valueOf(view.input().toUpperCase());
        model.addWatch(color, price, date, type);
    }

    private void print(List<Watch> list) {
        list.forEach(x -> view.printMessage(x.toString()));
    }
}
