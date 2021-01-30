package com.talevski.viktor;

import com.talevski.viktor.constructor.CandyVendingMachine;

/**
 * Reference link for the State Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/state-pattern'.
 */
public class StateDesignPatternApplication {
    public static void main(String[] args) {
        System.out.println("Testing machine by inserting coin and pressing button.");
        CandyVendingMachine insertCoinAndPressButtonTest = new CandyVendingMachine(3);
        System.out.println(insertCoinAndPressButtonTest);
        insertCoinAndPressButtonTest.insertCoin();
        System.out.println(insertCoinAndPressButtonTest);
        insertCoinAndPressButtonTest.pressButton();
        System.out.println(insertCoinAndPressButtonTest);

        System.out.println();

        System.out.println("Testing machine by pressing button without inserting coin.");
        CandyVendingMachine pressButtonWithoutInsertingCoinTest = new CandyVendingMachine(3);
        System.out.println(pressButtonWithoutInsertingCoinTest);
        pressButtonWithoutInsertingCoinTest.pressButton();
        System.out.println(pressButtonWithoutInsertingCoinTest);

        System.out.println();

        System.out.println("Testing if the machine has ran out of candies.");
        CandyVendingMachine noCandiesAvailableTest = new CandyVendingMachine(3);
        System.out.println(noCandiesAvailableTest);
        noCandiesAvailableTest.insertCoin();
        noCandiesAvailableTest.pressButton();
        noCandiesAvailableTest.insertCoin();
        noCandiesAvailableTest.pressButton();
        noCandiesAvailableTest.insertCoin();
        noCandiesAvailableTest.pressButton();
        noCandiesAvailableTest.insertCoin();
        noCandiesAvailableTest.pressButton();
        System.out.println(noCandiesAvailableTest);
    }
}
