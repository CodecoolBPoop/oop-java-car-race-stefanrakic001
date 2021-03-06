package com.codecool;

import java.util.*;


public class Race {

    private List<Vehicle> vehiclesList = new ArrayList<>();
    private final static int raceHours = 50;
    private boolean isThereABrokenTruck;




    public void createVehicles() {
        for (int i = 0; i <10 ; i++) {
            vehiclesList.add(new Car());
            vehiclesList.add(new Motorcycle());
            vehiclesList.add(new Truck());
        }

        }


    public void findBrokenTruck() {
        for (Vehicle vehicle: vehiclesList) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getNormalSpeed() ==0) {
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
            for (Vehicle vehicle: vehiclesList) {
                vehicle.moveForAnHour(this);

            }

        }

    }

    public void printRaceResults() {
        for (Vehicle vehicle: vehiclesList) {
            String result = vehicle.getName()+" "+vehicle.getDistanceTraveled();
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
