package com.artamonov;

class TempSensors {
    private int id, tempSum, readingsCount;
    private double averageTemp;

    public TempSensors(int id, int temperature) {
        this.id = id;
        this.tempSum = temperature;
        this.readingsCount = 1;
    }

    public void addTemp(int temperature) {
        this.tempSum += temperature;
        this.readingsCount++;
    }

    public void calculateAverageTemp() {
        this.averageTemp = (double) tempSum / readingsCount;
    }

    public int getId() {
        return id;
    }

    public double getAverageTemp() {
        return Math.round(averageTemp * 10.0) / 10.0;
    }
}
