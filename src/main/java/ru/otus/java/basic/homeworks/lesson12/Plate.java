package ru.otus.java.basic.homeworks.lesson12;

public class Plate {
    private int plateVolume = 100;
    private int currentFood = plateVolume;
    private int amountFood;
    private int maxFood = plateVolume;

    public int getPlateVolume() {
        return plateVolume;
    }
    public int getAmountFood() {
        return amountFood;
    }
    public int getCurrentFood() {
        return currentFood;
    }
    public int getMaxFood() {
        return maxFood;
    }

    public Plate(int plateVolume) {
        this.maxFood = maxFood;
        this.currentFood = currentFood;
        this.plateVolume = plateVolume;
    }

    public void addFood(FoodPacket foodPacket){
        if (foodPacket.getFood() > getCurrentFood()){
            amountFood = (getMaxFood() - getCurrentFood());
            currentFood += amountFood;
            System.out.println("\nДосыпали из пакета в тарелку еды: " + amountFood);
            foodPacket.clear();
        } else {
            System.out.println("\nЗаканчивается корм. Необходим новый пакет с кормом.");
        }
    }

    public boolean isDecreaseFood(int amountFood){
        if (getCurrentFood() >= amountFood && getCurrentFood() >= 0){
            currentFood -= amountFood;
            return true;
        } return false;
    }

    public void plateInfo(){
        System.out.println("В тарелке объемом " + getPlateVolume() + " лежит количество еды, равное " + getCurrentFood() + ".");
    }

}
