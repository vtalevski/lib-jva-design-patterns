package com.talevski.viktor.model;

public class AuthorizedSignatory implements Cloneable {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "The name is - '" + this.name + "' and the designation is - '" + this.designation + "'.";
    }
}
