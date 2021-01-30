package com.talevski.viktor.state;

import com.talevski.viktor.constructor.CandyVendingMachine;

public class NoCandyState implements CandyVendingMachineState {
    private CandyVendingMachine candyVendingMachine;

    public NoCandyState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candies available.");
    }

    @Override
    public void pressButton() {
        System.out.println("No candies available.");
    }

    @Override
    public void dispenseCandy() {
        System.out.println("No candies available.");
    }

    @Override
    public String toString() {
        return "NoCandyState.";
    }
}

