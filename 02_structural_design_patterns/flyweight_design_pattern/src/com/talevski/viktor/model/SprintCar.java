package com.talevski.viktor.model;

public class SprintCar extends RaceCar {
    public static Integer springCars = 0;

    public SprintCar() {
        springCars = springCars + 1;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("The new location of the " + super.getCarName() + " is X - '" + newX + "' and Y - '" + newY + "'.");
    }
}
