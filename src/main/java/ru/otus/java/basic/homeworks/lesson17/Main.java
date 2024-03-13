package ru.otus.java.basic.homeworks.lesson17;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иванов Иван Иванович", 111000L, Position.DEVELOPER);
        Person person2 = new Person("Соколов Евгений Олегович", 333000L, Position.DIRECTOR);
        Person person3 = new Person("Уткин Павел Петрович", 444000L, Position.BRANCH_DIRECTOR);
        Person person4 = new Person("Быстров Максим Львович", 555000L, Position.QA);
        Person person5 = new Person("Умный Олег Васильевич", 666000L, Position.DRIVER);
        Person person6 = new Person("Котов Станислав Альбертович", 777000L, Position.JANITOR);
        Person person7 = new Person("Пятнистый Лев Петрович", 888000L, Position.JUNIOR_DEVELOPER);
        Person person8 = new Person("Петров Александр Николаевич", 999000L, Position.ENGINEER);
        Person person9 = new Person("Семенов Валерий Александрович", 121000L, Position.MANAGER);
        Person person10 = new Person("Алешин Алексей Валерьевич", 223000L, Position.PLUMBER);
        Person person11 = new Person("Лебедев Иван Александрович", 224000L, Position.SENIOR_MANAGER);


        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.addPerson(person1);
        personDataBase.addPerson(person2);
        personDataBase.addPerson(person3);
        personDataBase.addPerson(person4);
        personDataBase.addPerson(person5);
        personDataBase.addPerson(person6);
        personDataBase.addPerson(person7);
        personDataBase.addPerson(person8);
        personDataBase.addPerson(person9);
        personDataBase.addPerson(person10);
        personDataBase.addPerson(person11);


        personDataBase.findById(333000L);


        System.out.println(personDataBase.isManager(person2));
        System.out.println(personDataBase.isEmployee(333000L));

        System.out.println();
        Sort.bubbleSort(new int[]{1, 50, 15, 39, 7, 6, 4});

    }




}
