package com.artamonov;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityPriceAnalyzer {

    public static Map<Integer, Map<String, Integer>> getYearlyMaxPrices(List<CityPriceInfo> records) {
        return records.stream()
                .collect(Collectors.groupingBy(
                        CityPriceInfo::getYear,
                        Collectors.toMap(
                                CityPriceInfo::getCity,
                                CityPriceInfo::getPrice,
                                Math::max // Берем максимальную цену
                        )
                ));
    }
}
