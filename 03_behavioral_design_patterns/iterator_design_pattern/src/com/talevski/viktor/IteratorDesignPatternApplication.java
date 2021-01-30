package com.talevski.viktor;

import com.talevski.viktor.aggregator.DesignPatternAggregator;
import com.talevski.viktor.aggregator.DesignPatternAggregatorImpl;
import com.talevski.viktor.iterator.DesignPatternIterator;
import com.talevski.viktor.model.DesignPattern;

/**
 * Reference link for the Iterator Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/iterator-pattern'.
 */
public class IteratorDesignPatternApplication {
    public static void main(String[] args) {
        DesignPattern factoryMethod = new DesignPattern("Creational", "Factory Method");
        DesignPattern abstractFactory = new DesignPattern("Creational", "Abstract Factory");

        DesignPattern adapter = new DesignPattern("Structural", "Adapter");
        DesignPattern bridge = new DesignPattern("Structural", "Bridge");

        DesignPattern chainOfResponsibility = new DesignPattern("Behavioral", "Chain Of Responsibility");
        DesignPattern iterator = new DesignPattern("Behavioral", "Iterator");

        DesignPatternAggregator designPatternAggregator = new DesignPatternAggregatorImpl();
        designPatternAggregator.addPattern(factoryMethod);
        designPatternAggregator.addPattern(abstractFactory);
        designPatternAggregator.addPattern(adapter);
        designPatternAggregator.addPattern(bridge);
        designPatternAggregator.addPattern(chainOfResponsibility);
        designPatternAggregator.addPattern(iterator);

        System.out.println("Print the design patterns before removing.");
        printDesignPatterns(designPatternAggregator);

        System.out.println();

        System.out.println("Print the design patterns after removing.");
        designPatternAggregator.removePattern(factoryMethod);
        designPatternAggregator.removePattern(abstractFactory);
        printDesignPatterns(designPatternAggregator);
    }

    public static void printDesignPatterns(DesignPatternAggregator designPatternAggregator) {
        DesignPatternIterator designPatternIterator = designPatternAggregator.getDesignPatternIterator();
        while (!designPatternIterator.isLastDesignPattern()) {
            DesignPattern designPattern = designPatternIterator.nextDesignPattern();
            System.out.println(designPattern.getDesignPatternType() + " - " + designPattern.getDesignPatternName());
        }
    }
}
