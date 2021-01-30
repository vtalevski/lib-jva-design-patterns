package com.talevski.viktor.model;

public class OrchidBouquet extends FlowerBouquet {
    public OrchidBouquet() {
        super.setDescription("Orchid Bouquet.");
    }

    @Override
    public Double getCost() {
        return 22.0;
    }
}
