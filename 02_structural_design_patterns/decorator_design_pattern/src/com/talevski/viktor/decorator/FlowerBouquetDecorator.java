package com.talevski.viktor.decorator;

import com.talevski.viktor.model.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    private FlowerBouquet flowerBouquet;

    public FlowerBouquet getFlowerBouquet() {
        return flowerBouquet;
    }

    public void setFlowerBouquet(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public abstract String getDescription();
}
