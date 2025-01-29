package com.artamonov;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TrapezoidArea {
    static class TrapezoidAreaTask implements Runnable {
        private final double start;
        private final double end;
        private final int steps;
        private final Function function;
        private double partialArea;

        public TrapezoidAreaTask(double start, double end, int steps, Function function) {
            this.start = start;
            this.end = end;
            this.steps = steps;
            this.function = function;
        }

        @Override
        public void run() {
            double stepSize = (end - start) / steps;
            partialArea = 0.0;
            for (int i = 0; i < steps; i++) {
                double x1 = start + i * stepSize;
                double x2 = x1 + stepSize;
                partialArea += (function.calculate(x1) + function.calculate(x2)) / 2 * stepSize;
            }
        }

        public double getPartialArea() {
            return partialArea;
        }
    }

    @FunctionalInterface
    interface Function {
        double calculate(double x);
    }

    public static double calculateArea(Function function, double start, double end, int totalSteps, int threads) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        double rangePerThread = (end - start) / threads;
        int stepsPerThread = totalSteps / threads;

        TrapezoidAreaTask[] tasks = new TrapezoidAreaTask[threads];
        Future<?>[] futures = new Future<?>[threads];

        for (int i = 0; i < threads; i++) {
            double subStart = start + i * rangePerThread;
            double subEnd = subStart + rangePerThread;
            tasks[i] = new TrapezoidAreaTask(subStart, subEnd, stepsPerThread, function);
            futures[i] = executor.submit(tasks[i]);
        }

        // Ожидание завершения всех потоков
        for (Future<?> future : futures) {
            future.get();
        }

        // Суммируем результаты
        double totalArea = 0.0;
        for (TrapezoidAreaTask task : tasks) {
            totalArea += task.getPartialArea();
        }

        executor.shutdown();
        return totalArea;
    }
}
