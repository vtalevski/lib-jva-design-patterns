package com.talevski.viktor.factory;

import com.talevski.viktor.model.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(String pizzaType);
}
