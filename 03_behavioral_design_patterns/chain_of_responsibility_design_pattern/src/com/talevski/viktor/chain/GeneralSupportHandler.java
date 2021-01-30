package com.talevski.viktor.chain;

public class GeneralSupportHandler extends SupportHandler {
    public GeneralSupportHandler(Integer level) {
        super.level = level;
    }

    @Override
    void handleRequest(String message) {
        System.out.println("GeneralSupportHandler: Processing request - '" + message + "'.");
    }
}

