package com.talevski.viktor.model;

public class InHousePizzaMaker extends PizzaMaker {

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing in house ingredients.");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding in house toppings.");
    }

    @Override
    public boolean customerWantsPackedPizza() {
        return false;
    }
}
