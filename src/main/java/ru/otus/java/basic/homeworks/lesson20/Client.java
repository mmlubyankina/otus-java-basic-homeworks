package ru.otus.java.basic.homeworks.lesson20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static DataInputStream inputStream;
    private final DataOutputStream outputStream;


    public Client(InputStream inputStream, OutputStream outputStream) throws IOException, NumberFormatException {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try (Socket socket = new Socket("localhost", 8080)) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());

                String listOfOperation = inputStream.readUTF();
                System.out.println(listOfOperation);

                String selectedOperation = scanner.nextLine();
                client.outputStream.writeUTF(selectedOperation);
                client.outputStream.flush();

                try {
                    System.out.println("Введите первый операнд: ");
                    Double firstNum = Double.valueOf(scanner.nextLine());
                    client.outputStream.writeDouble(firstNum);
                    client.outputStream.flush();

                    System.out.println("Введите второй операнд: ");
                    Double secondNum = Double.valueOf(scanner.nextLine());
                    client.outputStream.writeDouble(secondNum);
                    client.outputStream.flush();

                } catch (NumberFormatException e){
                   throw new NumberFormatException("Некорректный ввод операнда.");
                }

                String result = inputStream.readUTF();
                System.out.println(result);

            } catch (IOException e) {
                throw new RuntimeException(e) ;
            }
        }


    }


}

