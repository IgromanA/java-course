package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of English words: ");
        int n = Integer.parseInt(sc.nextLine());

        DictionaryCreator dictionary = new DictionaryCreator();
        
        System.out.println("Enter a description of the English words: ");
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            dictionary.addNote(line);
        }
        sc.close();

        System.out.println(dictionary.getLatinWordCount());
        System.out.println(dictionary.getLatintoEnglishDictionary());
    }
}
