package com.artamonov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Map<Integer, Long> classicTime = new HashMap<>();
        Map<Integer, Long> cachedTime = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n >> ");
        int n = scanner.nextInt();
        scanner.close();

        long startTime;
        long endTime;
        long totalTime;

        for (int i = 1; i <= n; i++) {

            startTime = System.currentTimeMillis();
            System.out.println("F_classic(" + i + ") = " + Fibonacci.classicFibonacci(i));
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            classicTime.put(i, totalTime);
            System.out.println("Затрачено времени (мс): " + totalTime + "\n");

            startTime = System.currentTimeMillis();
            System.out.println("F_cached(" + i + ") = " + OptimizedFibonacci.cachedFibonacci(i));
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            cachedTime.put(i, totalTime);
            System.out.println("Затрачено времени (мс): " + totalTime + "\n");
        }

        WritetoFile.writeTimesToFile("classic.txt", classicTime);
        WritetoFile.writeTimesToFile("cached.txt", cachedTime);
    }
}