package com.artamonov;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DataAnalysisWorkerClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 5000;
    private static Socket workerSocket; // Объявляем переменную workerSocket

    public static void main(String[] args) {
        try {
            workerSocket = new Socket(SERVER_ADDRESS, SERVER_PORT); // Присваиваем значение переменной
            System.out.println("Подключен к серверу");

            DataOutputStream outputStream = new DataOutputStream(workerSocket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Введите город, год и максимальную цену (через запятую):");
                String input = scanner.nextLine();
                outputStream.writeUTF(input);

                System.out.println("Введите 'exit' для выхода или любую другую команду для продолжения:");
                String command = scanner.nextLine();
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Выходим с сервера...");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workerSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}