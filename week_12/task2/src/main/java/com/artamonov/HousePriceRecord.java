package com.artamonov;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HousePriceRecord {

    public static Map<Integer, Map<String, Integer>> getYearlyMaxPrices(List<DataLoader> records) {
        return records.stream()
                .collect(Collectors.groupingBy(
                        DataLoader::getYear,
                        Collectors.toMap(
                                DataLoader::getCity,
                                DataLoader::getPrice,
                                Math::max // Берем максимальную цену
                        )
                ));
    }
}
