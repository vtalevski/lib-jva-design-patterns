package com.talevski.viktor.command.car;

import com.talevski.viktor.command.Command;
import com.talevski.viktor.model.Car;

public class CarStopCommand implements Command {
    private Car car;

    public CarStopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("This is the execute method of the CarStopCommand class.");
        car.stop();
    }

    @Override
    public void undo() {
        System.out.println("This is the undo method of the CarStopCommand class.");
        car.move();
    }
}
