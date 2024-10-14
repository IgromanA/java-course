package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int size = sc.nextInt();

        double[] array = new double[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextDouble();
        }
        
        sc.close();

        System.out.println("Source array:");
        printArray(array);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
