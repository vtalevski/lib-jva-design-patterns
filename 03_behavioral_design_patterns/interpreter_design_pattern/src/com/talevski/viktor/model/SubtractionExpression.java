package com.talevski.viktor.model;

import com.talevski.viktor.engine.InterpreterEngine;

public class SubtractionExpression implements Expression {
    private String sentence;

    public SubtractionExpression(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public Integer interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.subtract(sentence);
    }
}
