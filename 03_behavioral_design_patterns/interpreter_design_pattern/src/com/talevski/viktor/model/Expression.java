package com.talevski.viktor.model;

import com.talevski.viktor.engine.InterpreterEngine;

public interface Expression {
    Integer interpret(InterpreterEngine interpreterEngine);
}
