package ru.otus.java.basic.homeworks.lesson14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        array(new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}});
//        array(new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}});

    }

    public static void array(String[][] arr) {
        int[][] intArr = new int[arr.length][arr.length];
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4 && arr[j].length != 4) {
                    throw new AppArraySizeException("Необходимо передать корректный размер массива - 4х4.");

                } else if (arr[i].length == 4 && arr[j].length == 4) {
                    try {
                        counter = counter + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e){
                        throw new AppArrayDataException("Ошибка в ячейке: [" + i + "][" + j + "]");
                    }
                }
            }
        }

        if (arr.length == 4) {
            sum = getSum(arr, intArr, sum);
            System.out.println("Сумма элементов массива intArr равна: " + sum);
        }
        System.out.println();
        printArr(arr);
    }

    /** метод для подсчета суммы элементов */
    private static int getSum(String[][] arr, int[][] intArr, int sum) {
        System.out.println("Вывод преобразованного массива и суммы его элементов:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                intArr[i][j] = Integer.parseInt(arr[i][j]);
                System.out.print(intArr[i][j] + " ");
                sum += intArr[i][j];
            }
            System.out.println();
        }
        return sum;
    }


    /** метод для печати массива */
    private static void printArr(String[][] arr) {
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
