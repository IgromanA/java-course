package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = sc.nextDouble();
        sc.close();

        Heron heronSqrt = new Heron(number);
        double answer = heronSqrt.heronSqrt();

        System.out.printf("The square root of the number %.5f by Heron's method: %.5f\n", number, answer);
    }
}
