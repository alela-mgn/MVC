package com.practice.Java.view;

import com.practice.Java.controller.Controller;

public class UserView implements View{
    @Override
    public void outputOnDisplay() {
        System.out.println("Для запуска программы нажмите одну из цифр:" + "\n" + "1 - список всех часов"
                + "\n" + "2 - сорт. по цене" + "\n" + "3 - сорт. по цвету" + "\n" + "4 - сорт. по дате" + "\n"
                + "5 - сумма всех часов"+ "\n" + "6 - добавление нового товара(в порядке: цвет, цена, дата, тип часов)" + "\n"
                + "Введите quit для завершения работы программы");
        Controller controller = new Controller();
        controller.keyboardReading();
    }
}
