package ru.otus.java.basic.homeworks.lesson17;

import java.util.Arrays;

public class Sort {

    public static void bubbleSort(int[] array){
        System.out.println(Arrays.toString(array));
        boolean isSwapPlaces = false;
        while (!isSwapPlaces){
            isSwapPlaces = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    isSwapPlaces = false;

                    int savedArray = array[i];
                    array[i] = array[i+1] ;
                    array[i+1] = savedArray;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }


}
