package ru.otus.java.basic.homeworks.lesson17;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {

    private Map<Long, Person> personsMap = new HashMap<>();

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personsMap="
                +
                personsMap +
                '}';
    }


    public void addPerson(Person person) {
        personsMap.put(person.getId(), person);
    }


    public Person findById(Long id){
        System.out.println("По идентификатору " + id + " найден сотрудник: " + personsMap.get(id));
        return personsMap.get(id);
    }


    public boolean isManager(Person person){
        return person.isTopPosition();
    }


    public boolean isEmployee(Long id){
        return !personsMap.get(id).getPositionName().isTop();
    }



}
