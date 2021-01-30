package com.talevski.viktor.service;

import com.talevski.viktor.factory.RaceCarFactory;
import com.talevski.viktor.model.RaceCar;

public class RaceCarClientImpl implements RaceCarClient {
    private Integer currentX = 0;
    private Integer currentY = 0;
    private RaceCar raceCar;

    public RaceCarClientImpl(String key) {
        this.raceCar = RaceCarFactory.getRaceCar(key);
    }

    @Override
    public void moveCar(Integer newX, Integer newY) {
        raceCar.moveCar(this.currentX, this.currentY, newX, newY);
        this.currentX = newX;
        this.currentY = newY;
    }
}
