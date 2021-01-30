package com.talevski.viktor.command;

public interface Command {
    void execute();

    void undo();
}

