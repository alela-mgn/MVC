package com.practice.Java;

import com.practice.Java.controller.Controller;
import com.practice.Java.model.WatchServiceImpl;
import com.practice.Java.view.UserView;

public class Main {
    public static void main(String[] args) {
        UserView view = new UserView();
        WatchServiceImpl watchService = new WatchServiceImpl();
        Controller controller = new Controller(view, watchService);
        controller.run();
    }
}
