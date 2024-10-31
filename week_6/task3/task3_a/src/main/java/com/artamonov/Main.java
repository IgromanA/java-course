package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int count = sc.nextInt();
        
        int[] inputArray = new int[count];
        System.out.println("Enter the array elements (integers): ");
        for (int i = 0; i < count; i++) {
            inputArray[i] = sc.nextInt();
        }
        sc.close();

        int[] uniqueArray = Unduplicator.removeDuplicates(inputArray);
        System.out.print("Массив без дубликатов: \n");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

        System.out.print('\n');;
    }
}
