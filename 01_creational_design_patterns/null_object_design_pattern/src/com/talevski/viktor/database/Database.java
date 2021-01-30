package com.talevski.viktor.database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> scientists;

    public Database() {
        this.scientists = new ArrayList<>();
        scientists.add("Isaac Newton");
        scientists.add("Nikola Tesla");
        scientists.add("Albert Einstein");
    }

    public boolean scientistExist(String scientistName) {
        return scientists.stream().anyMatch(scientist -> scientist.contains(scientistName));
    }
}
