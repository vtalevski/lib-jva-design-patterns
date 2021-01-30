package com.talevski.viktor.model;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean paint;
    private boolean furnish;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public boolean isPaint() {
        return paint;
    }

    public void setPaint(boolean paint) {
        this.paint = paint;
    }

    public boolean isFurnish() {
        return furnish;
    }

    public void setFurnish(boolean furnish) {
        this.furnish = furnish;
    }
}
