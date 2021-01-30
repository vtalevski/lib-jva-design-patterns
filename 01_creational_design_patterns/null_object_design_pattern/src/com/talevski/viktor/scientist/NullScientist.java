package com.talevski.viktor.scientist;

public class NullScientist extends AbstractScientist {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getScientistName() {
        return "No such scientist exists.";
    }
}
