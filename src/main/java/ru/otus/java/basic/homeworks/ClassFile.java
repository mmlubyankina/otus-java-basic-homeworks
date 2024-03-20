package ru.otus.java.basic.homeworks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClassFile {

    private File dir = new File("C:\\Users\\kosti\\IdeaProjects\\otus-java-basic-homeworks-new\\src");
    private final File[] filesOfDir = dir.listFiles();
    private String fileName = null;
    private boolean isUsed = false;



    public File getTxt() {
        System.out.println("Список файлов в корневом каталоге:");
        for (File file : filesOfDir){
            if (file.isFile() && file.getName().endsWith(".txt")){
                    System.out.println(file.getName());
                }
            }
        return null;
    }


    /** поиск файла и вычитывание из него: */
    public void findFile() throws IOException {
        System.out.println("Введите имя файла, с которым хотите работать:");
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
            try (FileInputStream fis = new FileInputStream(fileName);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 InputStreamReader is = new InputStreamReader(bis);
            ) {
                int readedFile = is.read();
                System.out.println("Содержимое файла:");
                while (readedFile != -1) {
                    System.out.print((char)readedFile);
                    readedFile = is.read();
                    isUsed = true;
                }
            } catch (IOException e){
                System.out.println("Введенное имя файла отсутствует в корневом каталоге.");
            }

    }



    public File write() throws IOException {

        if (isUsed) {            
            System.out.println("\nВведите строку, которую необходимо записать в файл:");
            Scanner scanner = new Scanner(System.in);
            String readData = scanner.nextLine();

            File selectedFile = new File(readData);
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
                bos.write(readData.getBytes(StandardCharsets.UTF_8));
                System.out.println("\nЗапись в файл произведена.");

            } catch (IOException e) {
                System.out.println("\nОшибка записи в файл.");
            }
        } return null;
    }

    public File printFile() throws IOException{
        if (isUsed){
            System.out.println("\nСодержимое файла:");
            try (FileInputStream fis = new FileInputStream(fileName);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 InputStreamReader is = new InputStreamReader(bis);
            ) {
                int readedFile = is.read();
                while (readedFile != -1) {
                    System.out.print((char) readedFile);
                    readedFile = is.read();
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения из файла.");
            }
        } return null;
    }


}
