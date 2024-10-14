package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int size = sc.nextInt();

        double[] numbers = new double[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextDouble();
        }

        sc.close();
        
        double median = CalculatorMed.findMedian(numbers);
        System.out.printf("Median: %.2f\n", median);
    }
}
