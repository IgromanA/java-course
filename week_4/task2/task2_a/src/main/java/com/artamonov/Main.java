package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email adress: ");
        String email = sc.nextLine();

        EmailCheck checker = new EmailCheck();
        if (checker.isValid(email)) {
            System.out.println("It's a valid email address");
        } else {
            System.out.println("Invalid email address");
        }

        sc.close();
    }
}
