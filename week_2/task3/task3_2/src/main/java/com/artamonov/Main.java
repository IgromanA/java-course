package com.artamonov;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chepyrka", new Engine(90));
        System.out.println(car);

        Passenger passengerKotov = new Passenger("Котов А.М.");
        Passenger passengerSobakin = new Passenger("Собакин А.С.");

        car.addPassenger(passengerKotov);
        car.addPassenger(passengerSobakin);
        System.out.println(car);

        car.addPassenger(new Passenger("Костров О.К."));

        car.removePassenger(new Passenger("Попугаев И.С."));

        car.removePassenger(passengerKotov);
        System.out.println(car);
    }
}
