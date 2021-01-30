package com.talevski.viktor;

import com.talevski.viktor.decorator.GlitterDecorator;
import com.talevski.viktor.decorator.PaperWrapperDecorator;
import com.talevski.viktor.decorator.RibbonBowDecorator;
import com.talevski.viktor.model.FlowerBouquet;
import com.talevski.viktor.model.OrchidBouquet;
import com.talevski.viktor.model.RoseBouquet;

/**
 * Reference link for the Decorator Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/decorator-pattern'.
 */
public class DecoratorDesignPatternApplication {
    public static void main(String[] args) {
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapperDecorator(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBowDecorator(decoratedRoseBouquet);
        decoratedRoseBouquet = new GlitterDecorator(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription());
        System.out.println("The cost is - '" + decoratedRoseBouquet.getCost() + "' dollars.");

        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapperDecorator(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapperDecorator(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBowDecorator(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new GlitterDecorator(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription());
        System.out.println("The cost is - '" + decoratedOrchidBouquet.getCost() + "' dollars.");
    }
}
