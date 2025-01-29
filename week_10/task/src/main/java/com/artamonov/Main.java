package com.artamonov;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> intStack = new GenerateStack<>();
        intStack.push(20);
        intStack.push(10);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Is Empty: " + intStack.isEmpty());

        Stack<String> stringStack = new GenerateStack<>();
        stringStack.push("Java");
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.size());
    }
}

