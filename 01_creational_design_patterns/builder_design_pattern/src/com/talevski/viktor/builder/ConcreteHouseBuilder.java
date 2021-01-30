package com.talevski.viktor.builder;

import com.talevski.viktor.model.House;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        this.house.setFoundation("Concrete foundation");
        System.out.println("Concrete foundation built.");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Concrete structure");
        System.out.println("Concrete structure built.");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Concrete roof");
        System.out.println("Concrete roof built.");
    }

    @Override
    public void paint() {
        this.house.setPaint(true);
        System.out.println("Concrete house painted.");
    }

    @Override
    public void furnish() {
        this.house.setFurnish(true);
        System.out.println("Concrete house furnished.");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
