package com.codecool;
import java.util.*;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle{

    private int normalSpeed;
    private static Random random = new Random();
    private static List<String> carNames = new ArrayList<>(Arrays.asList(
            "Catalyst",
            "Inception",
            "Tempest",
            "Catalyst",
            "Excursion",
            "Whim",
            "Escape",
            "Umbra",
            "Expedition",
            "Climax"
    ));

    public Car() {
        this.normalSpeed = 80 + random.nextInt(30);
    }

    @Override
    public int getCurrentSpeed(Race race) {
        if (race.isThereABrokenTruck()) {
            return 75;
        }
        return normalSpeed;
    }

    @Override
    public void generateName() {
        int firstName = random.nextInt(carNames.size());
        int lastName = random.nextInt(carNames.size());
        this.setName(carNames.get(firstName)+" "+carNames.get(lastName));

        }

    }

