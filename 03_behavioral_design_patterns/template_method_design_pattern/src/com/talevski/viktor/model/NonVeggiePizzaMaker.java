package com.talevski.viktor.model;

public class NonVeggiePizzaMaker extends PizzaMaker {

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing non veggie ingredients.");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding non veggie toppings.");
    }

    @Override
    boolean customerWantsPackedPizza() {
        return true;
    }
}

