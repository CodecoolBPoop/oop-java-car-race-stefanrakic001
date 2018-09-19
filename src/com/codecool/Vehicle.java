package com.codecool;

public abstract class Vehicle {

    private String name;
    private int distanceTraveled;

    public abstract int getCurrentSpeed(Race race);
    public abstract void generateName();



    void moveForAnHour(Race race) {
        distanceTraveled += getCurrentSpeed(race);

    }

    public Vehicle() {
        generateName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

}
