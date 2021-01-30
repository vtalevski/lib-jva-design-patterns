package com.talevski.viktor.decorator;

import com.talevski.viktor.model.FlowerBouquet;

public class RibbonBowDecorator extends FlowerBouquetDecorator {
    public RibbonBowDecorator(FlowerBouquet flowerBouquet) {
        super.setFlowerBouquet(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return super.getFlowerBouquet().getDescription().concat(" ").concat("Ribbon bow added.");
    }

    @Override
    public Double getCost() {
        return super.getFlowerBouquet().getCost() + 6.0;
    }
}
