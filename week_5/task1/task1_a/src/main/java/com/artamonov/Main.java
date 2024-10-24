package com.artamonov;

import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
         Path path = Paths.get("example.txt");
         Reader.readFile(path);
    }
}
