package com.talevski.viktor;

import com.talevski.viktor.factory.ScientistFactory;

/**
 * Reference link for the Null Object Design Pattern - 'https://www.youtube.com/watch?v=pRUthlNOaps'.
 */
public class NullObjectDesignPatternApplication {
    public static void main(String[] args) {
        ScientistFactory scientistFactory = new ScientistFactory();
        System.out.println(scientistFactory.getScientist("Albert Einstein").getScientistName());
        System.out.println(scientistFactory.getScientist("Non existing scientist").getScientistName());
    }
}
