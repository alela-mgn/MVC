package com.practice.Java.controller;

import com.practice.Java.model.MainModel;

import java.util.Scanner;

public class Controller {
    public void addNewWatch() {
        MainModel mainModel = new MainModel();
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        int price = scanner.nextInt();
        String string = scanner.nextLine();
        String date = scanner.nextLine();
        String type = scanner.nextLine();
        mainModel.addWatch(color, price, date, type);
        mainModel.getAllWatch();
    }

    public void keyboardReading() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        MainModel mainModel = new MainModel();
        Controller controller = new Controller();
        while (!input.equals("quit")) {
            if (input.equals("1")) {
                mainModel.getAllWatch();
            } else if (input.equals("2")) {
                mainModel.sortByPrice();
            } else if (input.equals("3")) {
                mainModel.sortByColor();
            } else if (input.equals("4")) {
                mainModel.sortByDate();
            } else if (input.equals("5")) {
                mainModel.getAllPrice();
            } else if (input.equals("6")) {
                controller.addNewWatch();
            }

            input = scanner.nextLine();
        }
    }
}
