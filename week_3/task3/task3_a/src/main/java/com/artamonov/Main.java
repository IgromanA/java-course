package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int size = sc.nextInt();

        double[] numbers = new double[size];

        System.out.println("Введите числа:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextDouble();
        }
        
        sc.close();

        Counter maxCounter = new Counter(numbers);
        int count = (int) maxCounter.maxCounter();

        System.out.println("Количество чисел, равных максимальному: " + count);
    }
}
