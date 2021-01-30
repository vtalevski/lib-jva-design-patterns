package com.talevski.viktor;

import com.talevski.viktor.mediator.Commander;
import com.talevski.viktor.mediator.CommanderImpl;
import com.talevski.viktor.model.ArmedUnit;
import com.talevski.viktor.model.SoldierArmedUnit;
import com.talevski.viktor.model.TankArmedUnit;

/**
 * Reference link for the Mediator Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/mediator-pattern'.
 */
public class MediatorDesignPatternApplication {
    public static void main(String[] args) {
        Commander commander = new CommanderImpl();

        ArmedUnit soldierArmedUnit = new SoldierArmedUnit(commander);
        ArmedUnit tankArmedUnit = new TankArmedUnit(commander);

        commander.registerArmedUnits(soldierArmedUnit, tankArmedUnit);
        commander.startAttack(soldierArmedUnit);
        commander.startAttack(tankArmedUnit);
        commander.stopAttack(soldierArmedUnit);
        commander.startAttack(tankArmedUnit);
    }
}
