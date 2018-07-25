package com.codecool;
import java.util.Random;

public class Motorcycle extends Vehicle{

    private int normalSpeed;
    private static Random random = new Random();
    private static int motorName = 1;

    public Motorcycle() {
        this.normalSpeed = 100;

    }

    @Override
    public int getCurrentSpeed(Race race) {
        if (Weather.isRaining()) {
            int newSpeed = normalSpeed - (10 + random.nextInt(45));
            return newSpeed;
        }
        return normalSpeed;
    }

    @Override
    public void generateName() {
        this.setName("Motorcycle " + Integer.toString(motorName++) );
    }
}
