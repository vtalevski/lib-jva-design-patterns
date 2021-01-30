package com.talevski.viktor;

import com.talevski.viktor.command.Command;
import com.talevski.viktor.command.car.CarMoveCommand;
import com.talevski.viktor.command.car.CarStopCommand;
import com.talevski.viktor.command.merryGoRound.MerryGoRoundStartCommand;
import com.talevski.viktor.command.merryGoRound.MerryGoRoundStopCommand;
import com.talevski.viktor.control.RemoteControl;
import com.talevski.viktor.model.Car;
import com.talevski.viktor.model.MerryGoRound;

/**
 * Reference link for the Command Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/command-pattern'.
 */
public class CommandDesignPatternApplication {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Car car = new Car();
        System.out.println("Testing onButtonPressed on RemoteControl for Car.");
        Command carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);
        System.out.println("Testing offButtonPressed on RemoteControl for Car.");
        Command carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);
        System.out.println("Testing undoButtonPressed on RemoteControl for Car.");
        remoteControl.undoButtonPressed();

        System.out.println();

        MerryGoRound merryGoRound = new MerryGoRound();
        System.out.println("Testing onButtonPressed on RemoteControl for MerryGoRound.");
        Command merryGoRoundStartCommand = new MerryGoRoundStartCommand(merryGoRound);
        remoteControl.onButtonPressed(merryGoRoundStartCommand);
        System.out.println("Testing offButtonPressed on RemoteControl for MerryGoRound.");
        Command merryGoRoundStopCommand = new MerryGoRoundStopCommand(merryGoRound);
        remoteControl.offButtonPressed(merryGoRoundStopCommand);
        System.out.println("Testing undoButtonPressed on RemoteControl for MerryGoRound.");
        remoteControl.undoButtonPressed();
    }
}
