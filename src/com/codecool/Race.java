package com.codecool;

import java.util.*;


public class Race {

    private static final int raceHours = 50;
    private List<Vehicle> vehicleList = new ArrayList<>();
    private boolean isThereABrokenTruck;

    public void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicleList.add(new Car());
            vehicleList.add(new Motorcycle());
            vehicleList.add(new Truck());

        }

    }
    public void findBrokenTruck() {
        for (Vehicle vehicle: vehicleList) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getNormalSpeed() == 0 ) {
                    setThereABrokenTruck(true);
                    break;
                }
            }

        }
    }

    public void simulateRace() {
        for (int i = 0; i < raceHours; i++) {
            setThereABrokenTruck(false);
            findBrokenTruck();
            Weather.setRaining();
            for (Vehicle vehicle : vehicleList) {
                vehicle.moveForAnHour(this);
            }
        }

    }

    public void printRaceResults() {
        for (Vehicle vehicle : vehicleList) {
            String result = vehicle.getName() + " " + vehicle.getDistanceTraveled() + " km";
            System.out.println(result);

        }

    }

    public boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }

    public void setThereABrokenTruck(boolean thereABrokenTruck) {
        isThereABrokenTruck = thereABrokenTruck;
    }


    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();

    }
}
