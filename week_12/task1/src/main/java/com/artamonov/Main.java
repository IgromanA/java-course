package com.artamonov;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int start = 1;
        int end = 1000000;

        long startTime = System.currentTimeMillis();
        List<Integer> primesWorkStealing = PrimeCalculator.findPrimesWorkStealing(start, end);
        long endTime = System.currentTimeMillis();
        System.out.println("Work Stealing Method Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        List<Integer> primesShuffle = PrimeCalculator.findPrimesShuffle(start, end);
        endTime = System.currentTimeMillis();
        System.out.println("Shuffle Method Time: " + (endTime - startTime) + " ms");
    }
}
