package com.talevski.viktor.command.merryGoRound;

import com.talevski.viktor.command.Command;
import com.talevski.viktor.model.MerryGoRound;

public class MerryGoRoundStartCommand implements Command {
    private MerryGoRound merryGoRound;

    public MerryGoRoundStartCommand(MerryGoRound merryGoRound) {
        this.merryGoRound = merryGoRound;
    }

    @Override
    public void execute() {
        System.out.println("This is the execute method of the MerryGoRoundStartCommand class.");
        merryGoRound.startRotating();
    }

    @Override
    public void undo() {
        System.out.println("This is the undo method of the MerryGoRoundStartCommand class.");
        merryGoRound.stopRotating();
    }
}
