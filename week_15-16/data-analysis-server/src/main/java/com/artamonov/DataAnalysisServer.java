package com.artamonov;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataAnalysisServer {
    private static final int PORT = 5000;
    private static final Map<String, List<Integer>> cityPriceData = new HashMap<>();
    private static int workerCount = 0;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Сервер запущен на порту " + PORT);

            Scanner serverScanner = new Scanner(System.in);
            while (true) {
                Socket workerSocket = serverSocket.accept();
                System.out.println("Подключен новый воркер. Количество воркеров: " + (workerCount + 1));
                workerCount++;

                DataAnalysisWorker worker = new DataAnalysisWorker(workerSocket, serverScanner);
                Thread workerThread = new Thread(worker);
                workerThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (workerCount == 0) {
                analyzeAndDisplayData();
            }
        }
    }

    private static void analyzeAndDisplayData() {
        System.out.println("Выводим гистограмму:");
        Map<String, List<Integer>> cityPriceDataCopy = new HashMap<>(cityPriceData);
        DataAnalysis analysis = new DataAnalysis(cityPriceDataCopy);
        analysis.analyzeData();
    }

    private static class DataAnalysisWorker implements Runnable {
        private Socket workerSocket;
        private DataInputStream inputStream;
        private Scanner serverScanner;

        public DataAnalysisWorker(Socket workerSocket, Scanner serverScanner) {
            this.workerSocket = workerSocket;
            this.serverScanner = serverScanner;
            try {
                this.inputStream = new DataInputStream(workerSocket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            boolean keepRunning = true;
            try {
                while (keepRunning && !workerSocket.isClosed()) {
                    String data = readDataFromWorker();
                    if (data == null) {
                        keepRunning = false;
                        workerCount--;
                        System.out.println("Воркер отключился или завершил передачу данных. Осталось " + workerCount + " воркер(ов).");
                        if (workerCount == 0) {
                            analyzeAndDisplayData(); // Вызываем анализ и вывод данных при завершении работы последнего воркера
                        }
                    } else {
                        processData(data);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                    workerSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private String readDataFromWorker() throws IOException {
            try {
                return inputStream.readUTF();
            } catch (EOFException e) {
                System.out.println("Воркер отключился или завершил передачу данных.");
                return null;
            }
        }

        private void processData(String data) {
            String[] parts = data.split(",");
            String city = parts[0];
            int year = Integer.parseInt(parts[1]);
            int maxPrice = Integer.parseInt(parts[2]);

            cityPriceData.computeIfAbsent(city, k -> new ArrayList<>()).add(maxPrice);
        }
    }
}