package com.artamonov;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OptimizedFibonacciTest {
    @Test
    public void testFibonacci() {
        assertEquals(0, OptimizedFibonacci.cachedFibonacci(0));
        assertEquals(1, OptimizedFibonacci.cachedFibonacci(1));
        assertEquals(1, OptimizedFibonacci.cachedFibonacci(2));
        assertEquals(2, OptimizedFibonacci.cachedFibonacci(3));
        assertEquals(3, OptimizedFibonacci.cachedFibonacci(4));
        assertEquals(5, OptimizedFibonacci.cachedFibonacci(5));
    }
}