package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StrChecker checker = new StrChecker();
        
        String target = sc.nextLine();  // Ввод строки поиска
        if (target == null || target.trim().isEmpty()) {
            System.out.println("Error: Search string mustn't be empty!");
            sc.close();
            return;
        }

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();   // Определение кол-ва элементов в массиве
        
        sc.nextLine();  // Считывание первой строки вводы
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        
        if (n == 0 || strings.length == 0) {    // Проверка массива на пустоту
            System.out.println("Error: String array mustn't be empty!");
            sc.close();
            return;
        }

        int matches = checker.findMatch(target, strings);
        System.out.println(matches);

        sc.close();
    }
}
