package ru.otus.java.basic.homeworks;


public class Main {
    private static final int ARRAY_SIZE = 100_000_000;

    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        double[] array1 = new double[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array1[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения одного потока = " + (endTime1 - startTime1) + " мс");


        ///*************************************************************************************


        long startTime21 = System.currentTimeMillis();
        double[] array2 = new double[ARRAY_SIZE];

        Thread t21 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < ARRAY_SIZE / 4; i++) {
                    array2[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t22 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = ARRAY_SIZE / 4; i < ARRAY_SIZE / 2; i++) {
                    array2[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t23 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE * 3 / 4; i++) {
                    array2[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t24 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = ARRAY_SIZE * 3 / 4; i < ARRAY_SIZE; i++) {
                    array2[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        t21.start();
        t22.start();
        t23.start();
        t24.start();

        long endTime22 = System.currentTimeMillis();
        System.out.println("Время выполнения четырех потоков = " + (endTime22 - startTime21) + " мс");


        long result1 = endTime1 - startTime1;
        long result2 = endTime22 - startTime21;
        if (result1 > result2){
            System.out.println("Время выполнения четырех потоков меньше времени выполнения одного на " + (result1 - result2));
        } else if (result1 == result2){
            System.out.println("Время выполнения равно.");
        } else System.out.println("Время выполнения одного потока меньше времени выполнения четырех на " + (result2 - result1));

    }



}
