package com.artamonov;

public class Heron {
    private double number;
    private final double precision = 0.001;

    public Heron(double number) {
        this.number = number;
    }
    
    public double heronSqrt() {
        
        double guess = number / 2.0;
        double previousGuess = 0.0;
        while (Math.abs(previousGuess - guess) > precision){
            previousGuess = guess;
            guess = (previousGuess + number / previousGuess) / 2.0;
        } 
        return guess;
    }
}
