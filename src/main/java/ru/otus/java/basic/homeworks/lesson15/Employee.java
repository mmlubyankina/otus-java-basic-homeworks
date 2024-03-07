package ru.otus.java.basic.homeworks.lesson15;

import java.util.*;

public class Employee {

    private String name;
    private Integer age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public static List<String> getNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        System.out.println("\nCписок сотрудников:");
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }


    public static List<Employee> getEmployeesByMinAge(List<Employee> employees, Integer minAge){
        List<Employee> employeesByAge = new ArrayList<>();
        System.out.println("\nCписок сотрудников, возраст которых больше либо равен " + minAge + ":");
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge){
                employeesByAge.add(employee);
            }
        }
        return employeesByAge;
    };


    public static void checkAverageAge(List<Employee> employees, Integer minAverageAge){
        Integer sum = 0;
        Integer avgAge = 0;
        for (Employee s : employees) {
            sum += s.getAge();
        }
        avgAge = sum/employees.size();
            if (minAverageAge <= avgAge){
                System.out.println("\nCредний возраст сотрудников - " + avgAge + " превышает минимальный средний возраст - " + minAverageAge);
            } else System.out.println("\nCредний возраст сотрудников - " + avgAge + " не превышает минимальный средний возраст - " + minAverageAge);
            return;
    };


    public static Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngestEmployee = employees.get(0);
        System.out.println("\nСамый молодой сотрудник:");
        for (Employee s : employees) {
            if(s.getAge() < youngestEmployee.getAge()){
                youngestEmployee = s;
            }
        }
        System.out.println(youngestEmployee);
        return youngestEmployee;
    };

}

