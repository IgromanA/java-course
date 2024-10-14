package com.artamonov;

public class Checker {
    public String weekday, temperature, precipitation, wind, wetness;

    public void setChecker(String weekday, String temperature, String precipitation, String wind, String wetness) {
        this.weekday = weekday;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.wind = wind;
        this.wetness = wetness;
    }

    public boolean weathewIsNice() {
        if ((!"sunday".equals(weekday)) |
            (!"warm".equals(temperature)) |
            (!"clear".equals(precipitation)) |
            (wind == "yes") |
            (wetness == "high")) {
            return false;
        }
        return true;
    }
}
