package com.talevski.viktor;

import com.talevski.viktor.factory.pizza.PizzaFactory;

import java.util.Scanner;

/**
 * Reference link for the Abstract Factory Pattern - 'https://springframework.guru/gang-of-four-design-patterns/abstract-factory-design-pattern'.
 */
public class AbstractFactoryDesignPatternApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of topping do you want?");
        String toppingType = scanner.next();
        PizzaFactory pizzaFactory = PizzaFactory.choosePizzaFactory(toppingType);
        System.out.println("What type of pizza do you want?");
        String pizzaType = scanner.next();

        pizzaFactory.createPizza(pizzaType);
    }
}
