package com.talevski.viktor.engine;

public class InterpreterEngine {
    public static final String BIG_SPACE = "( )+";
    public static final String NUMBERS_ONLY = "[^0-9]";
    public static final String SINGLE_SPACE = " ";

    public Integer add(String sentence) {
        String[] numbers = interpret(sentence);
        Integer firstNumber = Integer.parseInt(numbers[0]);
        Integer secondNumber = Integer.parseInt(numbers[1]);
        return firstNumber + secondNumber;
    }

    public Integer subtract(String sentence) {
        String[] numbers = interpret(sentence);
        Integer firstNumber = Integer.parseInt(numbers[0]);
        Integer secondNumber = Integer.parseInt(numbers[1]);
        return secondNumber - firstNumber;
    }

    private String[] interpret(String sentence) {
        return sentence
                .replaceAll(NUMBERS_ONLY, SINGLE_SPACE)
                .replaceAll(BIG_SPACE, SINGLE_SPACE)
                .trim()
                .split(SINGLE_SPACE);
    }
}
