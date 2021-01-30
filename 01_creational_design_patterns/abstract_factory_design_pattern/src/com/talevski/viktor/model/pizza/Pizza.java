package com.talevski.viktor.model.pizza;

public abstract class Pizza {
    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("The pizza is being baked.");
    }
}
