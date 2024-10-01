package com.artamonov;

public class Main {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5.66);
        System.out.printf("Octagon:\nInner radius = %.2f sm\nArea = %.2f sm^2\nPerimeter = %.2f sm\n", octagon.getInnerRadius(), octagon.calculateArea(), octagon.calculatePerimeter());
    }
}
