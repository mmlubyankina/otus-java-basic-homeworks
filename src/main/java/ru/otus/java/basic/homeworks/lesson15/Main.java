package ru.otus.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        returnArrayList(1, 5);
        returnSum(new Integer[]{1, 2, 3, 4, 5, 6, 10, 14});
        fillList(3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        increaseList(4, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        /*******************************************************************************/


        Employee employee1 = new Employee("Иванов Иван Иванович",57);
        Employee employee2 = new Employee("Петров Иван Петрович",70);
        Employee employee3 = new Employee("Соколов Алексей Олегович",36);
        Employee employee4 = new Employee("Котов Андрей Алексеевич", 29);
        Employee employee5 = new Employee("Булкин Петр Петрович", 50);
        Employee employee6 = new Employee("Лепс Григорий Петрович",67);


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);


        List<String> names = Employee.getNames(employees);
        System.out.println(names);

        List<Employee> employeeList = Employee.getEmployeesByMinAge(employees,60);
        System.out.println(employeeList);

        Employee.checkAverageAge(employees,30);

        Employee.getYoungestEmployee(employees);


    }




    public static void returnArrayList(int min, int max) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("Результат выполнения задания №1:");
        if (min > 0 && max > 0){
            for (int i = min; i <= max; i++) {
                integerArrayList.add(i);
            }
            System.out.println(integerArrayList);
        } else {
            System.out.println("Задайте числа > 0.");
        }
    }


    public static void returnSum(Integer[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(arr));
        Iterator<Integer> iter = integerArrayList.iterator();
        Integer sum = 0;
        System.out.println("\nРезультат выполнения задания №2:");
        for (Integer s : integerArrayList) {
            Integer num = iter.next();
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов списка, значение которых > 5, равно: " + sum);
    }


    public static void fillList(int num, List<Integer> list) {
        System.out.println("\nРезультат выполнения задания №3:");
        for (int i = 0; i < list.size(); i++) {
            list.set(i,num);
        }
        System.out.println(list);
    }


    public static void increaseList(Integer a, List<Integer> list) {
        System.out.println("\nРезультат выполнения задания №4:");
        System.out.println("Исходный список: " + list + " \nУвеличиваем аргументы списка на " + a);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,++a);
        }
        System.out.println("Результат после увеличения: " + list);
    }


}
