package com.talevski.viktor.model;

public class CityCar extends RaceCar {
    public static Integer cityCars = 0;

    public CityCar() {
        cityCars = cityCars + 1;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("The new location of the " + super.getCarName() + " is X - '" + newX + "' and Y - '" + newY + "'.");
    }
}
