package com.artamonov;

public class Console {
    private String name;
    private String color;
    private int releaseYear;

    public Console() {
        this.color = "grey";
        this.name = "Chinese copy";
    }

    public Console(String name, String color, int releaseYear) {
        this.name = name;
        this.color = color;

        if (releaseYear >= 0)
            this.releaseYear = releaseYear;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear >= 0)
            this.releaseYear = releaseYear;
    }
    
    public String toString() {
        return String.format("%s console in %s color was released in %d", name, color, releaseYear);
    }
}
