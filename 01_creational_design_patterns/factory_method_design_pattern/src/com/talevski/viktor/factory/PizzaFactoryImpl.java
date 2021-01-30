package com.talevski.viktor.factory;

import com.talevski.viktor.model.CheesePizza;
import com.talevski.viktor.model.PepperoniPizza;
import com.talevski.viktor.model.Pizza;
import com.talevski.viktor.model.VeggiePizza;

public class PizzaFactoryImpl extends PizzaFactory {
    private Pizza pizza;

    @Override
    public Pizza createPizza(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("We are sorry but we don't prepare such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
