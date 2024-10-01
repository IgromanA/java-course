package com.artamonov;

public class Main {
    public static void main(String[] args) {    
        Console playstationP = new Console("PSP", "white", 2005);
        System.out.println(playstationP);

        Console russianConsole = new Console();
        System.out.println(russianConsole);
    }
}
