package com.artamonov;

public class Main {
    public static void main(String[] args) {
        Author Lukyanenko = new Author("Lukyanenko S.V", 1968);

        Book bookNightWatch = new Book("Night Watch", Lukyanenko);
        System.out.println(bookNightWatch);
        Book bookRoughDraft = new Book("Rough Draft", Lukyanenko);
        System.out.println(bookRoughDraft);

        Book bookMetro = new Book("Metro 2033", new Author("Glukhovsky D.A.", 1979));
        System.out.println(bookMetro);
    }
}
