package com.practice.shop;

import com.practice.shop.controller.Controller;
import com.practice.shop.model.WatchService;
import com.practice.shop.model.WatchServiceImpl;
import com.practice.shop.view.UserView;

public class Main {
    public static void main(String[] args) {
        UserView view = new UserView();
        WatchService watchService = new WatchServiceImpl();
        Controller controller = new Controller(view, watchService);

        controller.run();
    }
}
