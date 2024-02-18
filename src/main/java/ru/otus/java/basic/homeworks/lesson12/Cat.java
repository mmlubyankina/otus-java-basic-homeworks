package ru.otus.java.basic.homeworks.lesson12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;


    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean isSatiety() {
        if (satiety){
            System.out.println("Кот " + getName() + " не голоден.");
            return true;
        }
        System.out.println("Кот " + getName() + " голоден.");
        return false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        System.out.println();
        if (!isSatiety()){
            System.out.println("Кот " + getName() + " идет поесть.");
            if (plate.isDecreaseFood(getAppetite())){
                System.out.println("Кот " + getName() + " съел " + getAppetite() + " корма из тарелки.\nВ тарелке осталось "
                        + plate.getCurrentFood() + " еды.");
                satiety = true;
                isSatiety();
            } else {
                System.out.println("В тарелке не хватает еды. Необходимо досыпать еду из пакета.");
            }
        } else {
            System.out.println("\nКот " + getName() + " не голоден.");
        }
    }

    public void catInfo() {
        if (isSatiety()) {
            System.out.println(isSatiety());
        } else {
            System.out.println(getName() + " может съесть количество еды: " + getAppetite());
        }

    }
}
