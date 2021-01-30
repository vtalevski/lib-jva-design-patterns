package com.talevski.viktor.decorator;

import com.talevski.viktor.model.FlowerBouquet;

public class GlitterDecorator extends FlowerBouquetDecorator {
    public GlitterDecorator(FlowerBouquet flowerBouquet) {
        super.setFlowerBouquet(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return super.getFlowerBouquet().getDescription().concat(" ").concat(" Glitter added.");
    }

    @Override
    public Double getCost() {
        return super.getFlowerBouquet().getCost() + 4.0;
    }
}
