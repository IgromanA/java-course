package com.artamonov;


import java.util.Scanner;
/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");

        Age yourAge = new Age(sc.nextInt());
        yourAge.getAge();

        sc.close();
    }
}
