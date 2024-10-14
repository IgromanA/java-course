package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checker weatherCheck = new Checker();

        System.out.println("Enter day of the week:");
        weatherCheck.weekday = sc.nextLine();
        
        System.out.println("Enter temperature: (hot/warm/cold)");
        weatherCheck.temperature = sc.nextLine();
        
        System.out.println("Enter precipitation: (clear/cloudy/rain/snow/hail)");
        weatherCheck.precipitation = sc.nextLine();
        
        System.out.println("It's windy? (yes/no)");
        weatherCheck.wind = sc.nextLine();
        
        System.out.println("What humidity? (high/low)");
        weatherCheck.wetness = sc.nextLine();
        
        sc.close();
        
        boolean canPlay = weatherCheck.weathewIsNice();
        if (canPlay) {
            System.out.println("YES! YES! YES!");
        } else {
            System.out.println("NO! NO! NO!");
        }
    }
}
