package com.talevski.viktor.client;

import com.talevski.viktor.engine.InterpreterEngine;
import com.talevski.viktor.model.AdditionExpression;
import com.talevski.viktor.model.Expression;
import com.talevski.viktor.model.SubtractionExpression;

public class InterpreterClient {
    private InterpreterEngine interpreterEngine;

    public InterpreterClient(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }

    public Integer interpret(String sentence) {
        Expression expression;

        if (sentence.contains("add")) {
            expression = new AdditionExpression(sentence);
        } else if (sentence.contains("subtract")) {
            expression = new SubtractionExpression(sentence);
        } else {
            throw new IllegalArgumentException("The operation defined in the '" + sentence + "' sentence, is not a valid expression.");
        }

        Integer result = expression.interpret(interpreterEngine);
        System.out.println(sentence);
        return result;
    }
}
