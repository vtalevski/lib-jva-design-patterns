package com.talevski.viktor.model;

public class VeggiePizzaMaker extends PizzaMaker {

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing veggie ingredients.");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding veggie toppings.");
    }

    @Override
    boolean customerWantsPackedPizza() {
        return true;
    }
}
