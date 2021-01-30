package com.talevski.viktor.model.sauce;

public class TomatoSauce implements Sauce {
    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Tomato sauce prepared.");
    }
}
