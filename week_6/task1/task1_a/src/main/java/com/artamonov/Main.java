package com.artamonov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        System.out.println("Enter numbers with a spaces: ");
        String[] numbers = sc.nextLine().split(" ");
        sc.close();

        for (String number : numbers) {
            input.add(Integer.parseInt(number));
        }

        List<List<Integer>> permutations = Permutator.perms(input);
        System.out.println("All possible permutations:");
        System.out.println(permutations);
    }
}
