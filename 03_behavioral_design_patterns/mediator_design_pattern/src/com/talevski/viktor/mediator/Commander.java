package com.talevski.viktor.mediator;

import com.talevski.viktor.model.ArmedUnit;

public interface Commander {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void stopAttack(ArmedUnit armedUnit);
}