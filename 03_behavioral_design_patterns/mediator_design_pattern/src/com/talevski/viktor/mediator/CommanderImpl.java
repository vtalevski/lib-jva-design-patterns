package com.talevski.viktor.mediator;

import com.talevski.viktor.model.ArmedUnit;

public class CommanderImpl implements Commander { /* This is the mediator. */
    ArmedUnit soldierArmedUnit, tankArmedUnit;
    boolean attackStatus = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierArmedUnit, ArmedUnit tankArmedUnit) {
        this.soldierArmedUnit = soldierArmedUnit;
        this.tankArmedUnit = tankArmedUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.startAttack();
    }

    @Override
    public void stopAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}