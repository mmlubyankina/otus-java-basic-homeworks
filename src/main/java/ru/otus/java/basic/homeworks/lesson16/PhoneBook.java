package ru.otus.java.basic.homeworks.lesson16;

import java.util.*;

public class PhoneBook {

    private HashMap<String, List<Integer>> phoneBookMap;


    public PhoneBook() {
        this.phoneBookMap = new HashMap<>();
    }


    public void add(String name, Integer number){
        if (phoneBookMap.containsKey(name)){
            phoneBookMap.get(name).add(number);
            System.out.println("добавлен только номер телефона");
        }
        else {
            List<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(number);
            phoneBookMap.put(name,phoneNumbers);
            System.out.println("добавлена запись в справочник");
        }
    }


    public void getPhoneBookMap(){
        for (Map.Entry<String, List<Integer>> entry : phoneBookMap.entrySet()){
            System.out.println("ФИО: " + entry.getKey() + ", номера телефонов: " + entry.getValue());
        }
    }


    public void find(String name){
        System.out.println(phoneBookMap.get(name));
    }


    public boolean containsPhoneNumber(Integer findNum){
        for (Map.Entry<String, List<Integer>> entry : phoneBookMap.entrySet()){
            if (entry.getValue().contains(findNum)){
                System.out.println("Номер телефона " + findNum + " присутствует в справочнике.");
                return true;
            }
        }
        System.out.println("Номер телефона " + findNum + " отсутствует в справочнике.");
        return false;
    }


}
