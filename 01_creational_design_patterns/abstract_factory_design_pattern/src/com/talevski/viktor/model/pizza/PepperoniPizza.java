package com.talevski.viktor.model.pizza;

import com.talevski.viktor.factory.topping.ToppingFactory;

public class PepperoniPizza extends Pizza {
    ToppingFactory toppingFactory;

    public PepperoniPizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        toppingFactory.putSauce();
        toppingFactory.putCheese();
        System.out.println("Ingredients for the pepperoni pizza are added.");
    }
}
