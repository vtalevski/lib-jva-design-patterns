package com.talevski.viktor.constructor;

import com.talevski.viktor.state.CandyVendingMachineState;
import com.talevski.viktor.state.ContainsCoinState;
import com.talevski.viktor.state.DispenseCandyState;
import com.talevski.viktor.state.NoCandyState;
import com.talevski.viktor.state.NoCoinState;

public class CandyVendingMachine {
    private CandyVendingMachineState vendingMachineState;
    Integer numberOfCandies;

    private CandyVendingMachineState noCoinState;
    private CandyVendingMachineState containsCoinState;
    private CandyVendingMachineState dispenseCandyState;
    private CandyVendingMachineState noCandyState;

    public CandyVendingMachine(Integer numberOfCandies) {
        this.numberOfCandies = numberOfCandies;

        noCoinState = new NoCoinState(this);
        containsCoinState = new ContainsCoinState(this);
        dispenseCandyState = new DispenseCandyState(this);
        noCandyState = new NoCandyState(this);

        vendingMachineState = noCoinState;
    }

    public CandyVendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(CandyVendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Integer getNumberOfCandies() {
        return numberOfCandies;
    }

    public void setNumberOfCandies(Integer numberOfCandies) {
        this.numberOfCandies = numberOfCandies;
    }

    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(CandyVendingMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public CandyVendingMachineState getContainsCoinState() {
        return containsCoinState;
    }

    public void setContainsCoinState(CandyVendingMachineState containsCoinState) {
        this.containsCoinState = containsCoinState;
    }

    public CandyVendingMachineState getDispenseCandyState() {
        return dispenseCandyState;
    }

    public void setDispenseCandyState(CandyVendingMachineState dispenseCandyState) {
        this.dispenseCandyState = dispenseCandyState;
    }

    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }

    public void setNoCandyState(CandyVendingMachineState noCandyState) {
        this.noCandyState = noCandyState;
    }

    public void refillCandy(Integer numberOfCandiesForRefill) {
        this.numberOfCandies = this.numberOfCandies + numberOfCandiesForRefill;
        this.vendingMachineState = noCoinState;
    }

    public void insertCoin() {
        System.out.println("You inserted a coin.");
        vendingMachineState.insertCoin();
    }

    public void pressButton() {
        System.out.println("You have pressed the button.");
        vendingMachineState.pressButton();
        vendingMachineState.dispenseCandy();
    }

    public void ejectCandy() {
        if (numberOfCandies != 0) {
            numberOfCandies = numberOfCandies - 1;
        }
    }

    @Override
    public String toString() {
        return "The current state of the machine is - '" + vendingMachineState + "', and the number of available candies is - '" + numberOfCandies + "'.";
    }
}
