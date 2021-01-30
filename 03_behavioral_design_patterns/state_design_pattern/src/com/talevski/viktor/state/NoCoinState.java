package com.talevski.viktor.state;

import com.talevski.viktor.constructor.CandyVendingMachine;

public class NoCoinState implements CandyVendingMachineState {
    private CandyVendingMachine candyVendingMachine;

    public NoCoinState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        candyVendingMachine.setVendingMachineState(candyVendingMachine.getContainsCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted.");
    }

    @Override
    public void dispenseCandy() {
        System.out.println("No coin inserted.");
    }

    @Override
    public String toString() {
        return "NoCoinState.";
    }
}

