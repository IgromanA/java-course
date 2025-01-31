package com.artamonov;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.classicFibonacci(0));
        assertEquals(1, Fibonacci.classicFibonacci(2));
        assertEquals(1, Fibonacci.classicFibonacci(1));
        assertEquals(2, Fibonacci.classicFibonacci(3));
        assertEquals(3, Fibonacci.classicFibonacci(4));
        assertEquals(5, Fibonacci.classicFibonacci(5));
    }
}