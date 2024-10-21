package com.artamonov;

public class Formatter {
    public static String format(String input) {
        return input.replaceAll("(.)\\1{2,}", "$1");
    }
}
