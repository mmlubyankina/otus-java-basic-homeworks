package ru.otus.java.basic.homeworks.lesson17;

public class Person {

    private String name;
    private Long id;
    Position positionName;

    /** геттеры и сеттеры */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Position getPositionName() {
        return positionName;
    }


    public void setPositionName(Position positionName) {
        this.positionName = positionName;
    }


    public Person(String name, Long id, Position positionName) {
        this.name = name;
        this.id = id;
        this.positionName = positionName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", positionName=" + positionName +
                '}' + "\n";
    }


    public boolean isTopPosition(){
        if (positionName.isTop()){
            return true;
        }
        return false;
    }



}



