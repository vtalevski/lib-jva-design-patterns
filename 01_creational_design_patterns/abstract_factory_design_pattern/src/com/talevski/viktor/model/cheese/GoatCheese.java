package com.talevski.viktor.model.cheese;

public class GoatCheese implements Cheese {
    public GoatCheese() {
        grateCheese();
    }

    @Override
    public void grateCheese() {
        System.out.println("Goal cheese grated.");
    }
}
