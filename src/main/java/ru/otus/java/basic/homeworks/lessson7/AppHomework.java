package ru.otus.java.basic.homeworks.lessson7;

public class AppHomework {

    public static void main(String[] args) {
        sumOfPositiveElements();
        argSize(3);
        fillingZero();
        findMax(new int[][]{new int[]{-1, 0, 3}, {4, 20, -6}, {7, -8, 9}});
        sumElements(new int[][]{new int[]{1, 2, 3}, {4, 5, 6}});
    }

    /**
     * 1 - Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0.
     */
    public static void sumOfPositiveElements() {
        int[][] array = {{1, 3, -1}, {-5, 5, 1}, {8, 8, 1}};
        int sum = 0;
        System.out.println("\nЗадание №1: ");
           for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array.length; j++) {
                   if (array[i][j] > 0) {
                       sum += array[i][j];
                   }
               }
           }
           System.out.println("Сумма элементов массива, больших 0, равна: " + sum);
    }

    /**
     * 2 - Реализовать метод, который принимает в качестве аргумента int size
     * и печатает в консоль квадрат из символов * со сторонами соответствующей длины.
     */
    public static void argSize(int size) {
        char[][] array = new char['b']['b'];
        System.out.println("\nЗадание №2: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = '*';
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 3 - Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
     * и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
     */
    public static void fillingZero() {
        int[][] array = new int[7][7];
        System.out.println("\nЗадание №3: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);  // генерируем числа от 1 до 9, чтобы не генерировался 0
                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 4 - Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива.
     */
    public static int findMax(int[][] array) {
        int max = array[0][0];
        System.out.println("\nЗадание №4: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        return max;
    }


    /**
     * 5 - Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
     * если второй строки не существует, то в качестве результата необходимо вернуть -1.
     */
    public static void sumElements(int[][] array) {
        System.out.println("\nЗадание №5: ");
        int sum = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {                // строка
                sum += array[1][i];
            }
            System.out.println("Сумма элементов второй строки двумерного массива равна: " + sum);
        }
        else System.out.print("-1");
    }
}

