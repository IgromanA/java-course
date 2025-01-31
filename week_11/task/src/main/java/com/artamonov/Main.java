package com.artamonov;

import java.io.BufferedOutputStream;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Меню выбора задания
        System.out.println("Choose a task to complete:");
        System.out.println("1. Calculating the area of a curved trapezoid");
        System.out.println("2. Shannon entropy calculation");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Запуск расчета площади криволинейной трапеции
                System.out.println("You have chosen: Calculating the area of a curved trapezoid");

                TrapezoidArea.Function function = x -> Math.sin(x); // Пример функции: sin(x)
                double start = 0;
                double end = Math.PI;
                int totalSteps = 1_000_000;
                int threads = 4;

                double area = TrapezoidArea.calculateArea(function, start, end, totalSteps, threads);
                System.out.println("Area of curved trapezoid: " + area);
                break;

            case 2:
                // Запуск расчета энтропии по Шеннону
                System.out.println("You have chosen: Shannon entropy calculation");

                Path filePath = Paths.get("largefile.txt");

                // Генерация тестового файла больше объема оперативной памяти
                long memory = Runtime.getRuntime().maxMemory();
                System.out.println("RAM size: " + memory / (1024 * 1024) + " MB");

                if (!Files.exists(filePath)) {
                    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath.toFile()))) {
                        for (long i = 0; i < memory * 2; i++) {
                            bos.write((byte) (Math.random() * 256));
                        }
                    }
                }

                // Расчет энтропии
                double entropy = ShannonEntropy.calculateEntropy(filePath, 4);
                System.out.println("File entropy: " + entropy);
                break;

            default:
                System.out.println("Incorrect selection. Program termination.");
        }

        sc.close();
    }
}

