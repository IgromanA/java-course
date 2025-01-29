package com.artamonov;

public class DataLoader {
    private final int year;
    private final String city;
    private final int price;

    public DataLoader(int year, String city, int price) {
        this.year = year;
        this.city = city;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }
}
