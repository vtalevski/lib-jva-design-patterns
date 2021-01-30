package com.talevski.viktor.builder;

import com.talevski.viktor.model.House;

public class PrefabricatedHouseBuilder implements HouseBuilder {
    private House house;

    public PrefabricatedHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        this.house.setFoundation("Prefabricated foundation");
        System.out.println("Prefabricated foundation built.");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Prefabricated structure");
        System.out.println("Prefabricated structure built.");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Prefabricated roof");
        System.out.println("Prefabricated roof built.");
    }

    @Override
    public void paint() {
        this.house.setPaint(false);
        System.out.println("Prefabricated house not painted.");
    }

    @Override
    public void furnish() {
        this.house.setFurnish(true);
        System.out.println("Prefabricated house furnished.");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
