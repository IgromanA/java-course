package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit: ");

        Eratosthenes.limit = sc.nextInt();
        sc.close();

        Eratosthenes.printPrimes();
    }
}
