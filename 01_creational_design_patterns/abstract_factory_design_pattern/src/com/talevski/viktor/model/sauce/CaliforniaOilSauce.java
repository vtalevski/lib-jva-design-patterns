package com.talevski.viktor.model.sauce;

public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("California oil sauce prepared.");
    }
}
