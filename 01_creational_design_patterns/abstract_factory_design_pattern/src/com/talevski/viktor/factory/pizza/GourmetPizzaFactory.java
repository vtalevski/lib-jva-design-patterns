package com.talevski.viktor.factory.pizza;

import com.talevski.viktor.factory.topping.GourmetToppingFactory;
import com.talevski.viktor.factory.topping.ToppingFactory;
import com.talevski.viktor.model.pizza.CheesePizza;
import com.talevski.viktor.model.pizza.PepperoniPizza;
import com.talevski.viktor.model.pizza.Pizza;
import com.talevski.viktor.model.pizza.VeggiePizza;

public class GourmetPizzaFactory extends PizzaFactory {
    private Pizza pizza;

    @Override
    public Pizza createPizza(String pizzaType) {
        ToppingFactory gourmetToppingFactory = new GourmetToppingFactory();

        switch (pizzaType.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(gourmetToppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(gourmetToppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(gourmetToppingFactory);
                break;
            default:
                throw new IllegalArgumentException("We are sorry but we don't prepare such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
