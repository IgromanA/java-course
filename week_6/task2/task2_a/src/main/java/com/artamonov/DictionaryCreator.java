package com.artamonov;

import java.util.Map;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeMap;

public class DictionaryCreator {
    private final Map<String, List<String>> latinToEnglish = new TreeMap<>();

    public void addNote(String line) {
        String[] parts = line.split(" - ");
        String englishWord = parts[0];
        String[] latinWords = parts[1].split(", ");

        for (String latinWord : latinWords) {
            latinToEnglish
                .computeIfAbsent(latinWord, k -> new ArrayList<>())
                .add(englishWord);
        }
    }

    public int getLatinWordCount() {
        return latinToEnglish.size();
    }

    public String getLatintoEnglishDictionary() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<String>> note : latinToEnglish.entrySet()) {
            List<String> englishWords = note.getValue();
            Collections.sort(englishWords);
            result.append(note.getKey())
                    .append(" - ")
                    .append(String.join(", ", englishWords))
                    .append("\n");
        }
        return result.toString().trim();
    }
}
