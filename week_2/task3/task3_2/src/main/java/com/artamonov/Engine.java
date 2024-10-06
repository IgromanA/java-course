package com.artamonov;

public class Engine {
    private int power;

    public Engine(int power) {
        if (power >=0) {
            this.power = power;
        }
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        }
    }
}
