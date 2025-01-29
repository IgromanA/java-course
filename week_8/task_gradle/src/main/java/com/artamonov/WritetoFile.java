package com.artamonov;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WritetoFile {
    public static void writeTimesToFile(String fileName, Map<Integer, Long> times) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<Integer, Long> entry : times.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}