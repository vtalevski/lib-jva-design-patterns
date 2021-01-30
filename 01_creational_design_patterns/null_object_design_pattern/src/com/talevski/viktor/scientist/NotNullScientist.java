package com.talevski.viktor.scientist;

public class NotNullScientist extends AbstractScientist {
    public NotNullScientist(String scientistName) {
        super.scientistName = scientistName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getScientistName() {
        return super.scientistName;
    }
}
