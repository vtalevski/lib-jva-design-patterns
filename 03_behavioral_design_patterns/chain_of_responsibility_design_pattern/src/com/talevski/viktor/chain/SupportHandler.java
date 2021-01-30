package com.talevski.viktor.chain;

import java.util.Optional;

public abstract class SupportHandler {
    public static final Integer TECHNICAL = 10;
    public static final Integer BILLING = 20;
    public static final Integer GENERAL = 30;

    Integer level;
    private Optional<SupportHandler> optionalNextSupportHandler;

    public void setOptionalNextSupportHandler(Optional<SupportHandler> optionalNextSupportHandler) {
        this.optionalNextSupportHandler = optionalNextSupportHandler;
    }

    public void receiveRequest(Integer level, String message) {
        if (this.level < level || this.level == level) {
            handleRequest(message);
        }

        if (optionalNextSupportHandler.isPresent()) {
            optionalNextSupportHandler.get().receiveRequest(level, message);
        }
    }

    abstract void handleRequest(String message);
}
