package com.practice.shop.view;

import java.util.Scanner;

public class UserView {

    private static final Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String input() {
        return scanner.next();
    }
}
