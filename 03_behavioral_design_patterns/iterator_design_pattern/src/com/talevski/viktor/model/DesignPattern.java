package com.talevski.viktor.model;

public class DesignPattern {
    private String designPatternType;
    private String designPatternName;

    public DesignPattern(String designPatternType, String designPatternName) {
        this.designPatternType = designPatternType;
        this.designPatternName = designPatternName;
    }

    public String getDesignPatternType() {
        return designPatternType;
    }

    public String getDesignPatternName() {
        return designPatternName;
    }
}
