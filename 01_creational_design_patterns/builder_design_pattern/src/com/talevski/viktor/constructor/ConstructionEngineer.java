package com.talevski.viktor.constructor;

import com.talevski.viktor.builder.HouseBuilder;
import com.talevski.viktor.model.House;

public class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paint();
        this.houseBuilder.furnish();
        return this.houseBuilder.getHouse();
    }
}
