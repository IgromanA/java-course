package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        String input = sc.nextLine();
        String result = Formatter.format(input);
        System.out.println("Output: ");
        System.out.println(result);
        
        sc.close();
    }
}
