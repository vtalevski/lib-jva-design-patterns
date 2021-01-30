package com.talevski.viktor.model;

public abstract class RaceCar {
    private String carName;
    private Integer carSpeed;
    private Integer carHorsePower;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(Integer carSpeed) {
        this.carSpeed = carSpeed;
    }

    public Integer getCarHorsePower() {
        return carHorsePower;
    }

    public void setCarHorsePower(Integer carHorsePower) {
        this.carHorsePower = carHorsePower;
    }

    public abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
