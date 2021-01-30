package com.talevski.viktor;

import com.talevski.viktor.factory.PizzaFactory;
import com.talevski.viktor.factory.PizzaFactoryImpl;

import java.util.Scanner;

/**
 * Reference link for the Factory Method Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/factory-method-design-pattern'.
 */
public class FactoryMethodDesignPatternApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of pizza do you want?");
        String pizzaType = scanner.next();

        PizzaFactory pizzaFactory = new PizzaFactoryImpl();
        pizzaFactory.createPizza(pizzaType);
    }
}
