package com.artamonov;

import java.util.HashMap;
import java.util.Map;

public class OptimizedFibonacci {

    private static Map<Integer, Long> cache = new HashMap<>();

    public static long cachedFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = cachedFibonacci(n - 1) + cachedFibonacci(n - 2);
        cache.put(n, result);
        return result;
    }
}
