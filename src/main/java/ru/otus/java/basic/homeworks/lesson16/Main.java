package ru.otus.java.basic.homeworks.lesson16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", 111111);
        phoneBook.add("Петров Иван Петрович", 222222);
        phoneBook.add("Соколов Алексей Олегович", 333333);
        phoneBook.add("Соколов Алексей Олегович", 444444);
        System.out.println();

        phoneBook.add("Соколов Алексей Олегович", 555555);
        phoneBook.find("Соколов Алексей Олегович");
        System.out.println();

        phoneBook.add("Котов Василий Иванович", 666666);
        System.out.println();

        phoneBook.getPhoneBookMap();

        System.out.println();

        phoneBook.containsPhoneNumber(111111);
        phoneBook.containsPhoneNumber(111112);


    }




}
