package com.talevski.viktor.factory;

import com.talevski.viktor.model.CityCar;
import com.talevski.viktor.model.RaceCar;
import com.talevski.viktor.model.SprintCar;

import java.util.HashMap;
import java.util.Map;

public class RaceCarFactory {
    private static Map<String, RaceCar> flyweights = new HashMap<>();

    public static RaceCar getRaceCar(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }

        RaceCar raceCar;
        switch (key) {
            case "City":
                raceCar = new CityCar();
                raceCar.setCarName("City Car");
                raceCar.setCarSpeed(140);
                raceCar.setCarHorsePower(400);
                break;
            case "Sprint":
                raceCar = new SprintCar();
                raceCar.setCarName("Sprint Car");
                raceCar.setCarSpeed(160);
                raceCar.setCarHorsePower(1000);
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type.");
        }
        flyweights.put(key, raceCar);
        return raceCar;
    }
}
