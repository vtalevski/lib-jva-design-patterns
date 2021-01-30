package com.talevski.viktor.model;

public class Homework { // This is the client, that communicates with the target.
    private PenShell penShell;

    public void setPen(PenShell penShell) {
        this.penShell = penShell;
    }

    public void write(String solution) {
        this.penShell.write(solution);
    }
}
