package com.talevski.viktor.model;

import com.talevski.viktor.mediator.Commander;

public class SoldierArmedUnit implements ArmedUnit {
    private Commander commander;

    public SoldierArmedUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void startAttack() {
        if (commander.canAttack()) {
            System.out.println("Soldier armed unit start attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("Soldier armed unit cannot attack now because other armed units are attacking.");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("Soldier armed unit stopped the attack.");
        commander.setAttackStatus(true);
    }
}
