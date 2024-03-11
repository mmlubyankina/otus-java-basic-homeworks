package ru.otus.java.basic.homeworks.lesson17;

public enum Position {
    MANAGER(1),
    DIRECTOR(1),
    DRIVER(0),
    ENGINEER(0),
    SENIOR_MANAGER(1),
    DEVELOPER(0),
    QA(0),
    JANITOR(0),
    PLUMBER(0),
    BRANCH_DIRECTOR(1),
    JUNIOR_DEVELOPER(0);

    private int topPosition;

    public boolean isTop() {
        if (topPosition == 1){
            return true;
        }
        return false;
    }

    public void setTopPosition(int topPosition) {
        this.topPosition = topPosition;
    }


    Position(int topPosition) {
        this.topPosition = topPosition;
    }




}
