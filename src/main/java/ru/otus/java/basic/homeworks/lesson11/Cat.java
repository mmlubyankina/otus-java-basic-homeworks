package ru.otus.java.basic.homeworks.lesson11;

/** ВАЖНО - кот не умеет плавать !!!*/

public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed, endurance);
    }

    @Override
    public void info() {
        super.info();
    }
    @Override
    public void run(int distance) {
        super.run(distance);
    }
}
