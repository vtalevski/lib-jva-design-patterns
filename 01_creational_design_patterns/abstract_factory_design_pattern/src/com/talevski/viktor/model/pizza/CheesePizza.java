package com.talevski.viktor.model.pizza;

import com.talevski.viktor.factory.topping.ToppingFactory;

public class CheesePizza extends Pizza {
    ToppingFactory toppingFactory;

    public CheesePizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        toppingFactory.putSauce();
        toppingFactory.putCheese();
        System.out.println("Ingredients for the cheese pizza are added.");
    }
}
