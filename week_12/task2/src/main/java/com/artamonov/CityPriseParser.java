package com.artamonov;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CityPriseParser {

    public static List<CityPriceInfo> parseLines(List<String> lines) {
        return lines.stream()
                .map(CityPriseParser::parseLine)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static CityPriceInfo parseLine(String line) {
        try {
            String[] fields = line.split(",");
            int price = Integer.parseInt(fields[1].replaceAll("\\D", ""));
            String date = fields[2].replace("\"", "");
            String city = fields[fields.length - 3].replace("\"", "");
            int year = Integer.parseInt(date.substring(0, 4));
            return new CityPriceInfo(year, city, price);
        } catch (Exception e) {
            return null;
        }
    }
}
