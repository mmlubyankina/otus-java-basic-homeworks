package ru.otus.java.basic.homeworks.lesson20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static String[] mathOperation = {"-", "+", "*", "/"};
    private static ArrayList<String> stringArrayList = new ArrayList<>(List.of(mathOperation));


    public static void main(String[] args) throws Exception {

        ServerSocket socket = new ServerSocket(8080);
        while (true){
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

            outputStream.writeUTF("Выберите математическую операцию: " + stringArrayList);
            outputStream.flush();

            String typeOperation = inputStream.readUTF();

            Double firstNum = inputStream.readDouble();

            Double secondNum = inputStream.readDouble();

            String result = String.valueOf(math(typeOperation, firstNum, secondNum));
            System.out.println(result);

            outputStream.writeUTF(result);
            outputStream.flush();

        }



    }


    public static String math(String typeOperation, Double firstNum, Double secondNum) throws Exception {
        String resultCheck = null;
        String result = null;

        if (correctOperation(typeOperation)){

            if (typeOperation.equals("+")) {
                result = String.valueOf(firstNum + secondNum);
            } else if (typeOperation.equals("-")) {
                result = String.valueOf(firstNum - secondNum);
            } else if (typeOperation.equals("*")) {
                result = String.valueOf(firstNum * secondNum);
            } else if (typeOperation.equals("/")) {
                if (secondNum != 0) {
                    result = String.valueOf(firstNum / secondNum);
                } else
                    result = "Делить на 0 нельзя.";
                System.out.println("Делить на 0 нельзя.");
            }
            return "Результат выполнения операции " + firstNum + " " + typeOperation + " " + secondNum + " = " + result;

        } else {
            resultCheck = "Введен некорректный оператор.";
            result = resultCheck;
        }

        return result;
    }


    public static boolean correctOperation(String selectedTypeOperation){
        if (stringArrayList.contains(selectedTypeOperation)){
            return true;
        } return false;
    }




}
