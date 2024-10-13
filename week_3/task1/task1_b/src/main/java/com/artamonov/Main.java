package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scMonth = new Scanner(System.in);
        Scanner scYear = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = scMonth.nextInt();

        System.out.println("Enter the year: ");
        int year = scYear.nextInt();

        scMonth.close();
        scYear.close();

        DayNumber attempt = new DayNumber(month, year);
        System.out.printf("In month of %s days\n", attempt.getDayNumber());
    }
}
