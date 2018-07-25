package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {

    private static Random random = new Random();
    private int normalSpeed;
    private int breakdownTurnsLeft = 0;



    public Truck() {
        this.normalSpeed = 100;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public int getCurrentSpeed(Race race) {
        if (breakdownTurnsLeft ==0) {
            normalSpeed = 100;
            if (random.nextInt(5)==0) {
                breakdownTurnsLeft =2;
                normalSpeed =0;
            }
        } else {
            breakdownTurnsLeft--;
        }
        return normalSpeed;
    }

    @Override
    public void generateName() {
        this.setName(Integer.toString(random.nextInt(1000)));
    }
}