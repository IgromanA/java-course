package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IPv6 adress: ");
        String input = sc.nextLine();

        CheckerURL checker = new CheckerURL();
        if (checker.check(input)) {
            System.out.println("The entered IPv6 address is valid");
        } else {
            System.out.println("The entered IPv6 address is invalid");
        }
        
        sc.close();
    }
}
