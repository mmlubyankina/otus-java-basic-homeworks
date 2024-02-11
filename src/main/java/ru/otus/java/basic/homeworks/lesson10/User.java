package ru.otus.java.basic.homeworks.lesson10;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    public int getBirthYear(){
        return birthYear;
    }

    public void getInfo(){
        System.out.println("\nФИО: " + surname + " " + name+ " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("email: " + email);
    }

    public User(String surname, String name, String patronymic, int birthYear, String email){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

}
