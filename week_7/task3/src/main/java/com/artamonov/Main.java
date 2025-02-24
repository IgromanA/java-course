package com.artamonov;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите путь к директории: ");
        String directory = sc.nextLine();

        System.out.print("Выберите тип поиска (по имени файла (1), по содержимому (2)): ");
        int choice = sc.nextInt();
        sc.nextLine();

        try {
            List<Path> resultFiles;
            if (choice == 1) {
                System.out.print("Введите имя файла или его часть: ");
                String fileName = sc.nextLine();
                resultFiles = Finder.searchByName(directory, fileName);
                System.out.println("Файлы по имени:");
            } else if (choice == 2) {
                System.out.print("Введите ключевое слово для поиска в содержимом: ");
                String keyword = sc.nextLine();
                resultFiles = Finder.searchByContent(directory, keyword);
                System.out.println("Файлы по содержимому:");
            } else {
                System.out.println("Неверный выбор. Завершение программы.");
                return;
            }

            if (resultFiles.isEmpty()) {
                System.out.println("Файлы не найдены.");
            } else {
                resultFiles.forEach(System.out::println);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при доступе к файлам: " + e.getMessage());
        }
    }
}
