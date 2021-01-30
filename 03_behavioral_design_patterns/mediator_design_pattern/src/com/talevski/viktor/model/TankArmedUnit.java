package com.talevski.viktor.model;

import com.talevski.viktor.mediator.Commander;

public class TankArmedUnit implements ArmedUnit {
    private Commander commander;

    public TankArmedUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void startAttack() {
        if (commander.canAttack()) {
            System.out.println("Tank armed unit start attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("Tank armed unit cannot attack now because other armed units are attacking.");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("Tank armed unit stopped the attack.");
        commander.setAttackStatus(true);
    }
}

