package com.artamonov;

public class Console {
    private String name;
    private String color;
    private int releasedata;

    public Console() {
        this.color = "grey";
        this.name = "Chinese copy";
    }

    public Console(String name, String color, int releasedata) {
        this.name = name;
        this.color = color;

        if (releasedata >= 0)
            this.releasedata = releasedata;
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

    public int getReleaseData() {
        return releasedata;
    }

    public void setReleaseData(int releasedata) {
        if (releasedata >= 0)
            this.releasedata = releasedata;
    }
    
    public String toString() {
        return String.format("%s console in %s color was released in %d", name, color, releasedata);
    }
}
