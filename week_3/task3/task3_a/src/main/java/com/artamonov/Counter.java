package com.artamonov;

public class Counter {
    private double[] numbers;

    public Counter(double[] numbers) {
        this.numbers = numbers;
    }

    public double maxCounter() {
        double max = numbers[0];
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (double number : numbers) {
            if (number == max) {
                count++;
            }
        }
        return count;
    }
}
