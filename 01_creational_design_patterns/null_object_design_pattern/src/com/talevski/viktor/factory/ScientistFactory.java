package com.talevski.viktor.factory;

import com.talevski.viktor.database.Database;
import com.talevski.viktor.scientist.AbstractScientist;
import com.talevski.viktor.scientist.NotNullScientist;
import com.talevski.viktor.scientist.NullScientist;

public class ScientistFactory {
    private Database database;

    public ScientistFactory() {
        this.database = new Database();
    }

    public AbstractScientist getScientist(String scientistName) {
        if (database.scientistExist(scientistName)) {
            return new NotNullScientist(scientistName);
        } else {
            return new NullScientist();
        }
    }
}
