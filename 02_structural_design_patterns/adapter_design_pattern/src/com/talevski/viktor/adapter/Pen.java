package com.talevski.viktor.adapter;

import com.talevski.viktor.model.Ink;
import com.talevski.viktor.model.PenShell;

public class Pen implements PenShell { // This is the adapter that adapts the target - PenShell and the adaptee - Ink.
    private Ink ink;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    @Override
    public void write(String content) {
        this.ink.write(content);
    }
}
