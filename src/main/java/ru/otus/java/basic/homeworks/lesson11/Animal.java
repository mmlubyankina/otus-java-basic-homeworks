package ru.otus.java.basic.homeworks.lesson11;

public abstract class Animal {

    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;
    protected boolean swimAbility;
    protected int expensesEnduranceOfRun; // затраты выносливости на бег
    protected int expensesEnduranceOfSwim; // затраты выносливости на плавание
    protected float time;
    protected int requiredEnduranceOfRun;  // требуемые затраты выносливости
    protected int requiredEnduranceOfSwim;


    public int getExpensesEnduranceOfRun() {
        return expensesEnduranceOfRun;
    }

    /** конструкторы для разных животных*/
    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.swimAbility = true;
        this.expensesEnduranceOfRun = 1;
    }

    public Animal(String name, int runningSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
        this.expensesEnduranceOfRun = 1;
    }

    public void info(){
        if (swimAbility){
           System.out.println("Информация о животном: имя - " + name + ", скорость бега - " + runningSpeed + " м/с"
                   + ", скорость плавания - " + swimmingSpeed + " м/с" + ", выносливость - " + endurance + " ед.");
        } else System.out.println("Информация о животном: имя - " + name + ", скорость бега - " + runningSpeed + " м/с"
                + ", выносливость - " + endurance + " ед.");
        System.out.println();
    };


    public void run(int distance){
        this.time = (float) distance/runningSpeed;
        requiredEnduranceOfRun = distance * this.expensesEnduranceOfRun;
        System.out.println(name + " побежал расстояние " + distance + " м");
        if (requiredEnduranceOfRun > endurance){
            this.time = -1;
            System.out.println(name + " устал бежать. Время: " + Math.round(time) + "\n");
            return;
        } else
            System.out.println(name + " потратил выносливости на бег: " + requiredEnduranceOfRun + " ед.");
            System.out.println(name + " потратил время на бег: " + time + " секунд" + "\n");
    }

    public void swim(int distance){
        this.time = (float) distance/swimmingSpeed;
        requiredEnduranceOfSwim = distance * this.expensesEnduranceOfSwim;
        System.out.println(name + " поплыл расстояние " + distance + " м");
        if (requiredEnduranceOfSwim > endurance){
            this.time = -1;
            System.out.println(name + " устал плыть. Время: " + Math.round(time) + "\n");
            return;
        } else
            System.out.println(name + " потратил выносливости на плавание: " + requiredEnduranceOfSwim + " ед.");
        System.out.println(name + " потратил время на плавание: " + time + " секунд" + "\n");
    }


}
