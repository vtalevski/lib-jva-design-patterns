package com.talevski.viktor.chain;

public class TechnicalSupportHandler extends SupportHandler {
    public TechnicalSupportHandler(Integer level) {
        super.level = level;
    }

    @Override
    void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request - '" + message + "'.");
    }
}

