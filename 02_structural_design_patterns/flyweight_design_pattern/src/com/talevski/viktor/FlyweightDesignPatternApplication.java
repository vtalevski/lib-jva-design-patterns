package com.talevski.viktor;

import com.talevski.viktor.model.CityCar;
import com.talevski.viktor.model.SprintCar;
import com.talevski.viktor.service.RaceCarClient;
import com.talevski.viktor.service.RaceCarClientImpl;

/**
 * Reference link for the Flyweight Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/flyweight-pattern'.
 */
public class FlyweightDesignPatternApplication {
    public static void main(String[] args) {
        RaceCarClient[] raceCars = {
                new RaceCarClientImpl("City"),
                new RaceCarClientImpl("City"),
                new RaceCarClientImpl("City"),
                new RaceCarClientImpl("Sprint"),
                new RaceCarClientImpl("Sprint"),
                new RaceCarClientImpl("Sprint")
        };

        raceCars[0].moveCar(10, 5000);
        raceCars[1].moveCar(15, 2050);
        raceCars[2].moveCar(20, 4880);
        raceCars[3].moveCar(25, 6310);
        raceCars[4].moveCar(30, 2300);
        raceCars[5].moveCar(35, 1900);

        System.out.println("City Car Instances - '" + CityCar.cityCars + "'.");
        System.out.println("Sprint Car Instances - '" + SprintCar.springCars + "'.");
    }
}
