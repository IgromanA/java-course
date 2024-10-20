
package com.artamonov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input: ");
        String input = sc.nextLine();
        if (input.length() > 512) {
            System.out.println("Error: String is too long");
            return;
        }

        String[] reader = input.split("@");
        TempSensors[] sensors = new TempSensors[reader.length];

        for (int i = 0; i < reader.length; i++) {
            try {
                String idStr = reader[i].substring(0, 2);
                String tempStr = reader[i].substring(2);
                int id = Integer.parseInt(idStr);
                int temp = Integer.parseInt(tempStr);
                sensors[i] = new TempSensors(id, temp);

            } catch (Exception e) {
                System.out.println("Error: Incorrect input data format");
                return;
            }
        }

        System.out.println("Sort by ID or average temperature? (id/temp)");
        String sortOption = sc.nextLine().trim().toLowerCase();

        for (TempSensors sensor : sensors) {
            sensor.calculateAverageTemp();
        }

        if (sortOption.equals("id")) {
            sortById(sensors);
        } else if (sortOption.equals("temp")) {
            sortByTemp(sensors);
        } else {
            System.out.println("Error: Incorrect sorting selection!");
            return;
        }

        for (TempSensors sensor : sensors) {
            System.out.printf("%d %.2f\n", sensor.getId(), sensor.getAverageTemp());
        }
    }

    public static void sortById(TempSensors[] sensors) {    //Sort by ID
        for (int i = 0; i < sensors.length - 1; i++) {
            for (int j = i + 1; j < sensors.length; j++) {
                if (sensors[i].getId() > sensors[j].getId()) {
                    TempSensors temp = sensors[i];
                    sensors[i] = sensors[j];
                    sensors[j] = temp;
                }
            }
        }
    }

    public static void sortByTemp(TempSensors[] sensors) {    //Sort by avg temp
        for (int i = 0; i < sensors.length - 1; i++) {
            for (int j = i + 1; j < sensors.length; j++) {
                if (sensors[i].getAverageTemp() > sensors[j].getAverageTemp()) {
                    TempSensors temp = sensors[i];
                    sensors[i] = sensors[j];
                    sensors[j] = temp;
                }
            }
        }
    }
}
