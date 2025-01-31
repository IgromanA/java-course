package com.artamonov;

import java.util.List;
import java.util.Map;

public class DataAnalysis {
    private Map<String, List<Integer>> cityPriceData;

    public DataAnalysis(Map<String, List<Integer>> cityPriceData) {
        this.cityPriceData = cityPriceData;
    }

    public void analyzeData() {
        for (Map.Entry<String, List<Integer>> entry : cityPriceData.entrySet()) {
            String city = entry.getKey();
            List<Integer> prices = entry.getValue();

            // Сортировка цен по годам
            prices.sort(Integer::compareTo);

            // Построение гистограммы
            System.out.println("Гистограмма цен в " + city + ":");
            int maxPrice = prices.get(prices.size() - 1);
            int barWidth = 20; // Ширина столбца гистограммы
            int maxBarHeight = 20; // Максимальная высота столбца

            for (int price : prices) {
                int barHeight = (int) ((double) price / maxPrice * maxBarHeight);
                StringBuilder bar = new StringBuilder();
                for (int i = 0; i < barHeight; i++) {
                    bar.append('█');
                }
                for (int i = barHeight; i < maxBarHeight; i++) {
                    bar.append(' ');
                }
                System.out.println(bar.toString());
            }
            System.out.println(); // Пустая строка между гистограммами
        }
    }
}