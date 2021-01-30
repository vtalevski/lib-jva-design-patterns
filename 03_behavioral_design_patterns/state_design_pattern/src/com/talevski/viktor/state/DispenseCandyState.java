package com.talevski.viktor.state;

import com.talevski.viktor.constructor.CandyVendingMachine;

public class DispenseCandyState implements CandyVendingMachineState {
    private CandyVendingMachine candyVendingMachine;

    public DispenseCandyState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispensing.");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing.");
    }

    @Override
    public void dispenseCandy() {
        if (candyVendingMachine.getNumberOfCandies() > 0) {
            candyVendingMachine.setVendingMachineState(candyVendingMachine.getNoCoinState());
            candyVendingMachine.setNumberOfCandies(candyVendingMachine.getNumberOfCandies() - 1);
        } else {
            System.out.println("No candies available.");
            candyVendingMachine.setVendingMachineState(candyVendingMachine.getNoCandyState());
        }
    }

    @Override
    public String toString() {
        return "DispenseCandyState.";
    }
}

