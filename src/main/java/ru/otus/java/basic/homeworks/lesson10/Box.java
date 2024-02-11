package ru.otus.java.basic.homeworks.lesson10;

public class Box {
    private final int length;      // длина
    private final int width;       // ширина
    private final int height;      // высота
    private String item;
    private String color;
    private boolean open = false;           // открыта
    private String deleteItem = null;

/** геттеры и сеттеры: */
    public String getColor(){
        return color;
    }
    public String getItem(){
        return item;
    }
    public boolean isOpen(){
        if (open){
            return true;
        }
            return false;
    }
    public boolean isEmptyBox(){
        if (item == null || item.isEmpty()){
            return true;
        }
        return false;
    }



    /**сеттеры */
    public void setColor(String color){         // смена цвета
        this.color = color;
        System.out.println("Перекрасили коробку в новый цвет: " + color);
        System.out.println();
    }


    public boolean setOpen(){
        if (!isOpen()){
            this.open = true;
            System.out.println("Открыли коробку.");
        } else {
            System.out.println("Коробка открыта.");
        }
        return true;
    }

    public boolean setClose(){
        if (!isOpen()){
            System.out.println("Коробка уже закрыта. Повторно закрыть коробку не получится. Нужно сначала открыть коробку.");
        } else {
            this.open = false;
            System.out.println("Закрыли коробку.");
        }
        return true;
    }



    /** Если в конструкторе не задавать item, то тогда код будет таким:
     * чтобы this.item = _item; , потому что иначе переменная "item" не будет инициализироваться, и условие не будет работать !!!!
     * */

    public String setItem(String newItem){            // положить предмет в коробку
        if (this.isOpen()){
            if (item == null || item.isEmpty()) {
                this.item = newItem;
                System.out.println("Положили в коробку: " + newItem);
                System.out.println();
                return newItem;
            }
            else
                System.out.println("Хотим положить в коробку новый предмет: " + newItem);
                System.out.println("Коробка не пуста. Сначала необходимо освободить коробку. В коробке лежит: " + getItem());
            System.out.println();
            return item;
        } else System.out.println("Чтобы положить предмет, нужно открыть коробку.");
        System.out.println();
        return null;
    }



    public String removeItem(){            // убрать предмет
        if (this.isOpen()){
            if (item == null || item.isEmpty()) {
                System.out.println("Коробка уже пуста. Убрать из неё предмет не получится.");
                System.out.println();
                return item;
            }
            else
                deleteItem = this.getItem();
                this.item = null;
                System.out.println("Убрали " + deleteItem + " из коробки.");
        } else System.out.println("Чтобы удалить предмет, нужно открыть коробку.");
        System.out.println();
        return null;
    }



 /** конструктор: */
    public Box(int length, int width, int height, String color, String item){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.item = item;

    }



    /** методы - инфо о коробке: */
    public void info(){
        System.out.println("\nСвойства коробки: высота = " + length + ", " + "ширина = " + width + ", " + "глубина = " + height + ", " + "цвет: " + color);
        if (isOpen()){
            System.out.println("Коробка открыта.");
            if (isEmptyBox()){
                System.out.println("Коробка пуста");
            } else System.out.println("В коробке лежит: " + item);
        } else System.out.println("Коробка закрыта.");
        System.out.println();
    }


}
