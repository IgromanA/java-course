package com.artamonov;

import java.time.LocalDateTime; // Пакет time добавляет класс, который хранит дату и время
import java.time.Period; // Класс представляет кол-во времени в годах, месяцах и днях
import java.time.LocalDate; // Класс, который хранит только дату
import java.time.format.DateTimeFormatter; // Класс используется для форматирования дат

public class Student {
    private String name;
    private LocalDateTime birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    public Student(String name, LocalDateTime birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    // Используя метод between можно найти разницу между двумя датами, а метод getYears выразить эту разницу в годах
    public int getAge() {
        return Period.between(birthDate.toLocalDate(), LocalDate.now()).getYears();
    }
    
    // Метод возвращает значения true и false в зависимости от среднего балла
    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    public int getStudentID() {
        return studentId;
    }
    
    public void setStudentID(int studentId) {
        this.studentId = studentId;       
    }
    
    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return String.format("Студент %s:\n - ID: %d\n - Дата рождения: %s\n - Возраст: %d\n - Группа: %s\n - Средний балл: %.1f\n - Примерный студент: %s",
                name, studentId, DateTimeFormatter.ofPattern("dd-MM-yy").format(birthDate), getAge(), group, averageScore, isExcellentStudent() ? "Да" : "Нет");
    }
    // Используя класс DateTimeFormatter и его метод ofPattern мы преобразуем дату рождения (birthDate) в удобный нам вид
    // Для метода isExcellentStudent используется тернарный оператор, чтобы преобразовать boolean значение в String 
}
