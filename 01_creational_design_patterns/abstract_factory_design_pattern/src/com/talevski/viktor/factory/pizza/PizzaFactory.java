package com.talevski.viktor.factory.pizza;

import com.talevski.viktor.model.pizza.Pizza;

public abstract class PizzaFactory {
    public static PizzaFactory choosePizzaFactory(String toppingType) {
        switch (toppingType.toLowerCase()) {
            case "sicilian":
                return new SicilianPizzaFactory();
            case "gourmet":
                return new GourmetPizzaFactory();
            default:
                throw new IllegalArgumentException("We are sorry but we don't prepare such topping.");
        }
    }

    public abstract Pizza createPizza(String pizzaType);
}
