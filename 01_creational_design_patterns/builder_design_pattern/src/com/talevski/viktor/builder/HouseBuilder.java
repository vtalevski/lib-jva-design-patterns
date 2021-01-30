package com.talevski.viktor.builder;

import com.talevski.viktor.model.House;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paint();

    void furnish();

    House getHouse();
}
