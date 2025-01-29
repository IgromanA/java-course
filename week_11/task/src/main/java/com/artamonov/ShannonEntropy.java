package com.artamonov;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShannonEntropy {
    static class EntropyTask implements Runnable {
        private final Path filePath;
        private final long start;
        private final long end;
        private final Map<Byte, Long> localFrequencies;

        public EntropyTask(Path filePath, long start, long end) {
            this.filePath = filePath;
            this.start = start;
            this.end = end;
            this.localFrequencies = new HashMap<>();
        }

        @Override
        public void run() {
            try (RandomAccessFile file = new RandomAccessFile(filePath.toFile(), "r")) {
                file.seek(start);
                long bytesToRead = end - start;
                byte[] buffer = new byte[1024];
                while (bytesToRead > 0) {
                    int bytesRead = file.read(buffer, 0, (int) Math.min(buffer.length, bytesToRead));
                    if (bytesRead == -1) break;
                    for (int i = 0; i < bytesRead; i++) {
                        localFrequencies.merge(buffer[i], 1L, Long::sum);
                    }
                    bytesToRead -= bytesRead;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Map<Byte, Long> getLocalFrequencies() {
            return localFrequencies;
        }
    }

    public static double calculateEntropy(Path filePath, int threads) throws Exception {
        long fileSize = Files.size(filePath);
        long chunkSize = fileSize / threads;

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        EntropyTask[] tasks = new EntropyTask[threads];

        for (int i = 0; i < threads; i++) {
            long start = i * chunkSize;
            long end = (i == threads - 1) ? fileSize : (i + 1) * chunkSize;
            tasks[i] = new EntropyTask(filePath, start, end);
            executor.submit(tasks[i]);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }

        // Суммируем частоты
        Map<Byte, Long> globalFrequencies = new HashMap<>();
        for (EntropyTask task : tasks) {
            task.getLocalFrequencies().forEach((key, value) ->
                globalFrequencies.merge(key, value, Long::sum));
        }

        // Вычисляем энтропию
        long totalSymbols = globalFrequencies.values().stream().mapToLong(Long::longValue).sum();
        double entropy = 0.0;

        for (long frequency : globalFrequencies.values()) {
            double probability = (double) frequency / totalSymbols;
            entropy += -probability * (Math.log(probability) / Math.log(2));
        }

        return entropy;
    }
}
