package com.artamonov;

import java.util.Scanner;

public class App {
    public static void main(String[] arg){
        System.out.println("Введите сторонe додекаэдра: "); //Вводим длину стороны
        Scanner sc = new Scanner(System.in); 
        
        int a = sc.nextInt(); // Считываем введенное значение
        
        double V = mathV(a);
        System.out.println("Объем додекаэдра: " + V);
    
        sc.close();
    }
    public static double mathV(int a) {
        Double V = ((15 + 7 * Math.sqrt(5)) / 4 * Math.pow(a, 3)); // Вычисляем объем
        return V;
    }
}
