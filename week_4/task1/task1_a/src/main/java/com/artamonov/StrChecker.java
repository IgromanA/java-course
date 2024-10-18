package com.artamonov;

class StrChecker {
    public int findMatch(String target, String[] strings) {
        int cnt = 0;
        
        // Проверка строк на пустоту, а также на длину
        for (String str : strings) {
            if (str == null || str.isEmpty()) {
                System.out.println("Error: Empty string found");
                continue;
            }
            if (str.length() < target.length()) {
                System.out.println("Warning: String shorter than target substring");
                continue;
            }
        }

        // Счетчик совпадений
        for (String str : strings) {
            for (int i = 0; i <= str.length() - target.length(); i++) {
                if (str.substring(i, i + target.length()).equals(target)) {
                    cnt++;
                }
            }
        }
            
        return cnt;
    }
}
