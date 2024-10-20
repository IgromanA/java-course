package com.artamonov;

public class Shannon {
    public double calculateEntropy(String input) {
        if (input == null || input.equals("")) {
            return 0.0;
        }

        int[] freq = new int[256];
        int length = input.length();

        for (int i = 0; i < length; i++) {
            freq[input.charAt(i)]++;
        }

        double entropy = 0.0;

        for (int i  = 0; i < 256; i++) {
            if (freq[i] > 0) {
                double freqI = (double) freq[i] / length;
                entropy += -freqI * (Math.log(freqI) / Math.log(2)); 
            }
        }
        return entropy;
    }
}
