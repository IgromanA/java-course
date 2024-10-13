package com.artamonov;

public class DayNumber {
    private int month, year;

    public DayNumber(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getDayNumber() {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Invalid value");
        }
    }
}
