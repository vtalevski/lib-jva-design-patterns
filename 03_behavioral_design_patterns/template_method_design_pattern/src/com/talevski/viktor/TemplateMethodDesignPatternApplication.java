package com.talevski.viktor;

import com.talevski.viktor.model.InHousePizzaMaker;
import com.talevski.viktor.model.NonVeggiePizzaMaker;
import com.talevski.viktor.model.PizzaMaker;
import com.talevski.viktor.model.VeggiePizzaMaker;

/**
 * Reference link for the Template Method Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/template-method-pattern'.
 */
public class TemplateMethodDesignPatternApplication {
    public static void main(String[] args) {
        System.out.println("Making veggie pizza.");
        PizzaMaker veggiePizzaMaker = new VeggiePizzaMaker();
        veggiePizzaMaker.makePizza();

        System.out.println();

        System.out.println("Making non veggie pizza.");
        PizzaMaker nonVeggiePizzaMaker = new NonVeggiePizzaMaker();
        nonVeggiePizzaMaker.makePizza();

        System.out.println();

        System.out.println("Making in house pizza.");
        PizzaMaker inHouseAssortedPizzaMaker = new InHousePizzaMaker();
        inHouseAssortedPizzaMaker.makePizza();
    }
}
