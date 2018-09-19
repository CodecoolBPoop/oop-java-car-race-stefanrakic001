package com.codecool;
import java.util.Random;

public class Weather {

    private static boolean isRaining;

    static void setRaining() {
        isRaining = new Random().nextInt(30) == 0;
    }

    static boolean isRaining() {
        return isRaining;
    }
}

