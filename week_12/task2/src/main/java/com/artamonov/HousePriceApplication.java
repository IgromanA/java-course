package com.artamonov;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class HousePriceApplication {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/igromana/Downloads/archive/pp-2018.csv/pp-2018.csv";

        // Чтение строк из файла
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        // Парсинг данных
        List<CityPriceInfo> records = CityPriseParser.parseLines(lines);

        // Анализ данных: вычисляем максимальные цены по годам и городам
        Map<Integer, Map<String, Integer>> yearlyMaxPrices = CityPriceAnalyzer.getYearlyMaxPrices(records);

        // Построение гистограммы
        ChartVisuallizer.createHistogram(yearlyMaxPrices);
    }
}
