package com.talevski.viktor.model.pizza;

import com.talevski.viktor.factory.topping.ToppingFactory;

public class VeggiePizza extends Pizza {
    ToppingFactory toppingFactory;

    public VeggiePizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        toppingFactory.putSauce();
        toppingFactory.putCheese();
        System.out.println("Ingredients for the veggie pizza are added.");
    }
}
