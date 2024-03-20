package ru.otus.java.basic.homeworks;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ClassFile file = new ClassFile();


        file.getTxt();
        System.out.println();


        file.findFile();
        System.out.println();

        file.write();

        file.printFile();


    }
}
