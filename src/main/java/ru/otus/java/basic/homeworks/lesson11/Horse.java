package ru.otus.java.basic.homeworks.lesson11;

public class Horse extends Animal{
    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        this.expensesEnduranceOfSwim = 4;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void run(int distance) {
        super.run(distance);
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
    }
}
