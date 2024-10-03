package com.artamonov;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Кошкин А.М.", LocalDateTime.of(2000, Month.MARCH, 15, 0, 46), "18ПИ", 22, 4.9);
        Student stud2 = new Student("Собакин А.С.", LocalDateTime.of(2003, Month.SEPTEMBER, 27, 23, 45), "20ЭП", 45, 3.7);
        
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
