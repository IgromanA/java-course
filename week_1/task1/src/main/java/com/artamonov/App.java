package com.artamonov;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя"); //User вводит свое имя

        String username = sc.nextLine();
        System.out.println("Hello, " + username); //Вывод приветствия User'а
        sc.close();
    }
}
