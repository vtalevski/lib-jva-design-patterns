package com.talevski.viktor.state;

import com.talevski.viktor.constructor.CandyVendingMachine;

public class ContainsCoinState implements CandyVendingMachineState {
    private CandyVendingMachine candyVendingMachine;

    public ContainsCoinState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        candyVendingMachine.setVendingMachineState(candyVendingMachine.getDispenseCandyState());
    }

    @Override
    public void dispenseCandy() {
        System.out.println("Press button to dispense.");
    }

    @Override
    public String toString() {
        return "ContainsCoinState.";
    }
}
