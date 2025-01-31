package com.artamonov;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testRecursiveFibonacci() {
        assertEquals("Fibonacci(0) должен быть равен 0", 0, Fibonacci.classicFibonacci(0));
        assertEquals("Fibonacci(1) должен быть равен 1", 1, Fibonacci.classicFibonacci(1));
        assertEquals("Fibonacci(2) должен быть равен 1", 1, Fibonacci.classicFibonacci(2));
        assertEquals("Fibonacci(3) должен быть равен 2", 2, Fibonacci.classicFibonacci(3));
        assertEquals("Fibonacci(4) должен быть равен 3", 3, Fibonacci.classicFibonacci(4));
        assertEquals("Fibonacci(5) должен быть равен 5", 5, Fibonacci.classicFibonacci(5));
    }

    @Test
    public void testOptimizedFibonacci() {
        assertEquals("Fibonacci(0) должен быть равен 0", 0, OptimizedFibonacci.cachedFibonacci(0));
        assertEquals("Fibonacci(1) должен быть равен 1", 1, OptimizedFibonacci.cachedFibonacci(1));
        assertEquals("Fibonacci(2) должен быть равен 1", 1, OptimizedFibonacci.cachedFibonacci(2));
        assertEquals("Fibonacci(3) должен быть равен 2", 2, OptimizedFibonacci.cachedFibonacci(3));
        assertEquals("Fibonacci(4) должен быть равен 3", 3, OptimizedFibonacci.cachedFibonacci(4));
        assertEquals("Fibonacci(5) должен быть равен 5", 5, OptimizedFibonacci.cachedFibonacci(5));
        assertEquals("Fibonacci(10) должен быть равен 55", 55, OptimizedFibonacci.cachedFibonacci(10));
        assertEquals("Fibonacci(20) должен быть равен 6765", 6765, OptimizedFibonacci.cachedFibonacci(20));
    }
}
