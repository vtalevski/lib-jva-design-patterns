package com.talevski.viktor.control;

import com.talevski.viktor.command.Command;

public class RemoteControl {
    Command onCommand, offCommand, undoCommand;

    public void onButtonPressed(Command onCommand) {
        this.onCommand = onCommand;
        undoCommand = onCommand;
        this.onCommand.execute();
    }

    public void offButtonPressed(Command offCommand) {
        this.offCommand = offCommand;
        undoCommand = offCommand;
        this.offCommand.execute();
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
