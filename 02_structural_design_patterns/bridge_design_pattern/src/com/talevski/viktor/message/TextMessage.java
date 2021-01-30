package com.talevski.viktor.message;

import com.talevski.viktor.sender.MessageSender;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super.messageSender = messageSender;
    }

    @Override
    public void constructMessage(String message) {
        super.messageSender.sendMessage(message);
    }
}
