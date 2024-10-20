package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shannon calculator = new Shannon();

        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        double entropy = calculator.calculateEntropy(input);

        System.out.printf("Entropy of the string: %.4f\n", entropy);
        sc.close();
    }
}
