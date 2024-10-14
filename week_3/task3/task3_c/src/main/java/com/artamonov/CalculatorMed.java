package com.artamonov;

import java.util.Arrays;

class CalculatorMed {
    public static double findMedian(double[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;

        if (size % 2 == 0) {
            return (numbers[size / 2 - 1] + numbers[size / 2]) / 2;
        } else {
            return numbers[size / 2];
        }
    }
}
