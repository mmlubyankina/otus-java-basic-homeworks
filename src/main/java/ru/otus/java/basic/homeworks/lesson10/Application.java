package ru.otus.java.basic.homeworks.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Первая часть ДЗ:");
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1960, "ivanovii60@mail.ru"),
                new User("Петров", "Иван", "Петрович", 1971, "pertrov71pp@mail.ru"),
                new User("Соколов", "Алексей", "Олегович", 2000, "sokolovAA20@mail.ru"),
                new User("Котов", "Андрей", "Алексеевич", 2010, "kotovAA@mail.ru"),
                new User("Булкин", "Петр", "Петрович", 1989, "PPbulka@mail.ru"),
                new User("Лепс", "Григорий", "Петрович", 1950, "superpuper@mail.ru"),
                new User("Константинов", "Иван", "Егорович", 1967, "konstanta@mail.ru"),
                new User("Уколов", "Александр", "Андреевич", 2001, "2001ukolov@mail.ru"),
                new User("Синий", "Михаил", "Евгеньевич", 1991, "siniiMEX@mail.ru"),
                new User("Розенбаум", "Олег", "Александрович", 1999, "rozenbaumOOO@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBirthYear() < 1984) {
                users[i].getInfo();
            }
        }

        System.out.println();
        System.out.println("************************************************************");
        System.out.println("Вторая часть ДЗ:");

        Box box = new Box(5, 5, 6, "green", "cat");
        box.info();
        box.setItem("pen");
        box.setOpen();
        box.setItem("ball");
        box.removeItem();
        box.removeItem();
        box.setColor("blue");
        box.setItem("ball");
        box.info();
        box.setClose();
        box.info();
        box.setClose();

    }
}
