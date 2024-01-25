package ru.otus.java.basic.lesson5;

import java.util.Arrays;

public class HomeworkLesson5 {
    public static void main(String[] args) {
        printArguments(5, "Java");
        sumElementsOfArray();
        arrayLink();
        arrayLinkIncrement();
        arrayLinkSum();
    }

    // Задание 1. Метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз.
    public static void printArguments(int number, String argument) {
        System.out.println("\nРезультат выполнения Задания № 1:");
        for (int i = 0; i < number; i++) {
            System.out.println(argument);
        }
    }


    // Задание 2. Метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    // значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumElementsOfArray() {
        int[] array = {5, 6, 8, 89, -7, 32, -19, 3, 68, 21};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("\nРезультат выполнения Задания № 2:" + "\n" + sum);
    }

    // Задание 3. Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполнить каждую ячейку массива указанным числом.

    public static void arrayLink() {
        fillingArray(3, 4, 3, 5, 5, 6, 7, 8, 5, 6);
    }

    public static void fillingArray(int number, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println("\nРезультат выполнения Задания № 3:");
        System.out.println(Arrays.toString(arr));
    }


    // Задание 4. Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.

    public static void arrayLinkIncrement() {
        incrementArray(10, 4, 3, 5, 5, 6, 7, 8, 5, 6);
    }

    public static void incrementArray(int number, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
        System.out.println("\nРезультат выполнения Задания № 4:");
        System.out.println(Arrays.toString(arr));
    }


    // Задание 5. Метод, принимающий в качестве аргументов ссылку на целочисленный массив,
    // и печатающий в консоль информацию о том, сумма элементов какой из половин массива больше.

    public static void arrayLinkSum() {
        sumArray(10, 4, 5, 5, 6, 7, 8, 5, 6);
    }

    public static void sumArray(int... arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("\nРезультат выполнения Задания № 5:");
        if (sum1 > sum2) {
            System.out.println("Первая половина массива больше второй. Сумма элементов первой половины равна: " + sum1);
        } else if (sum1 < sum2) {
            System.out.println("Вторая половина массива больше первой. Сумма элементов второй половины равна: " + sum2);
        } else {
            System.out.println("Обе половины массива равны по сумме.");
        }
    }
}

