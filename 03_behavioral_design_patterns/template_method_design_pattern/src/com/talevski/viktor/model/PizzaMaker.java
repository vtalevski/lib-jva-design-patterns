package com.talevski.viktor.model;

public abstract class PizzaMaker {
    final void preparePizzaDough() {
        System.out.println("Preparing the pizza dough.");
    }

    final void preBakeCrust() {
        System.out.println("Pre baking the pizza crust.");
    }

    abstract void prepareIngredients();

    abstract void addToppings();

    final void bakePizza() {
        System.out.println("Baking the pizza.");
    }

    abstract boolean customerWantsPackedPizza();

    final void packPizza() {
        System.out.println("Packing the pizza.");
    }

    final public void makePizza() {
        preparePizzaDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if (customerWantsPackedPizza()) {
            packPizza();
        }
    }
}
