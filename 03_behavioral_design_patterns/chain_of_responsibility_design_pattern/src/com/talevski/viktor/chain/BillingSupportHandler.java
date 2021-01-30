package com.talevski.viktor.chain;

public class BillingSupportHandler extends SupportHandler {
    public BillingSupportHandler(Integer level) {
        super.level = level;
    }

    @Override
    void handleRequest(String message) {
        System.out.println("BillingSupportHandler: Processing request - '" + message + "'.");
    }
}

