package com.talevski.viktor.model;

public abstract class FlowerBouquet {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract Double getCost();
}
