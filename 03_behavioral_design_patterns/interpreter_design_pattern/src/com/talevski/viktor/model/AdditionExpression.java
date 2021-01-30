package com.talevski.viktor.model;

import com.talevski.viktor.engine.InterpreterEngine;

public class AdditionExpression implements Expression {
    private String sentence;

    public AdditionExpression(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public Integer interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.add(sentence);
    }
}
