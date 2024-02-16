package ru.otus.java.basic.homeworks.lesson11;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",1, 1);
        Dog dog = new Dog("Bobik",2,1,2);
        Horse horse = new Horse("Igor",3,2,5);

        cat.info();
        dog.info();
        horse.info();

        cat.run(5);
        dog.run(2);
        horse.run(4);

        dog.swim(1);
        horse.swim(7);

    }

}
