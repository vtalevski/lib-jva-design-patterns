package com.talevski.viktor;

import com.talevski.viktor.builder.ConcreteHouseBuilder;
import com.talevski.viktor.builder.PrefabricatedHouseBuilder;
import com.talevski.viktor.constructor.ConstructionEngineer;

/**
 * Reference link for the Builder Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/builder-pattern'.
 * Reference link for the Telescoping Constructor Pattern, which is also an anti pattern - 'http://www.javabyexamples.com/telescoping-constructor-in-java'.
 */
public class BuilderDesignPatternApplication {
    public static void main(String[] args) {
        System.out.println("Concrete house example.");
        ConstructionEngineer concreteHouseConstructionEngineer = new ConstructionEngineer(new ConcreteHouseBuilder());
        concreteHouseConstructionEngineer.constructHouse();

        System.out.println();

        System.out.println("Prefabricated house example.");
        ConstructionEngineer prefabricatedHouseConstructionEngineer = new ConstructionEngineer(new PrefabricatedHouseBuilder());
        prefabricatedHouseConstructionEngineer.constructHouse();
    }
}
