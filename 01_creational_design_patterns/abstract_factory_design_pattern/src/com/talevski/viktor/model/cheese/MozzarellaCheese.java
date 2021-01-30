package com.talevski.viktor.model.cheese;

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese() {
        grateCheese();
    }

    @Override
    public void grateCheese() {
        System.out.println("Mozzarella cheese grated.");
    }
}
