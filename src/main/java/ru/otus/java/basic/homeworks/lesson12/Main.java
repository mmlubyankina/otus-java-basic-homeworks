package ru.otus.java.basic.homeworks.lesson12;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzik", 50),
                new Cat("Vasya", 60),
                new Cat("Innokentyi", 40),
                new Cat("Boris", 70)
        };
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            cats[i].catInfo();
        }

        FoodPacket foodPacket1 = new FoodPacket(500);
        Plate plate = new Plate(100);
        System.out.println();
        plate.plateInfo();
        System.out.println("Пакет с едой содержит корма: " + foodPacket1.getFood());

        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        plate.addFood(foodPacket1);
        cats[2].eat(plate);
        cats[3].eat(plate);
        plate.addFood(foodPacket1);
        cats[4].eat(plate);
        FoodPacket foodPacket2 = new FoodPacket(500);
        plate.addFood(foodPacket2);
        cats[4].eat(plate);


    }

}

