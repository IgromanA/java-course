package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String line = sc.nextLine();
        sc.close();

        System.out.println(Processor.findMostFrequentChar(line));
    }
}
