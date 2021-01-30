package com.talevski.viktor;

import com.talevski.viktor.client.InterpreterClient;
import com.talevski.viktor.engine.InterpreterEngine;

/**
 * Reference link for the Interpreter Design Pattern from Spring Framework Guru - 'https://springframework.guru/gang-of-four-design-patterns/interpreter-pattern'.
 * Reference link for the Interpreter Design Pattern from YouTube - 'https://www.youtube.com/watch?v=uRhBjFjf8n8'.
 */
public class InterpreterDesignPatternApplication {
    public static void main(String[] args) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

        System.out.println("The addition of the numbers is - '" + interpreterClient.interpret("Please add 300 and 75.") + "'.");
        System.out.println("The subtraction of the numbers is - '" + interpreterClient.interpret("Please subtract 40 from 100.") + "'.");
    }
}
