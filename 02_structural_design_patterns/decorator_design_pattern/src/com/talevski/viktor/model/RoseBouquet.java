package com.talevski.viktor.model;

public class RoseBouquet extends FlowerBouquet {
    public RoseBouquet() {
        super.setDescription("Rose Bouquet.");
    }

    @Override
    public Double getCost() {
        return 12.0;
    }
}
