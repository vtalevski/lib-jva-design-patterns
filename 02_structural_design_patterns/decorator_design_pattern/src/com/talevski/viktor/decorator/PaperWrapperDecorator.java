package com.talevski.viktor.decorator;

import com.talevski.viktor.model.FlowerBouquet;

public class PaperWrapperDecorator extends FlowerBouquetDecorator {
    public PaperWrapperDecorator(FlowerBouquet flowerBouquet) {
        super.setFlowerBouquet(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return super.getFlowerBouquet().getDescription().concat(" ").concat(" Paper wrapper added.");
    }

    @Override
    public Double getCost() {
        return super.getFlowerBouquet().getCost() + 3.0;
    }
}
