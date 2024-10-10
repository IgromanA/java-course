package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту пирамиды: ");
        int height = sc.nextInt();
        sc.close();

        Pyramid pyramid = new Pyramid(height);
        pyramid.printPyramid();
    }
}
