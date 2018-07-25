package com.codecool;
import java.util.Random;

public class Weather {

    private static Random random = new Random();
    private static boolean isRaining;



    static void setRaining() {
        isRaining = random.nextInt(30) == 0;

    }

    static boolean isRaining() {
        return isRaining;
    }
}

