package com.talevski.viktor.message;

import com.talevski.viktor.sender.MessageSender;

public class EmailMessage extends Message {
    public EmailMessage(MessageSender messageSender) {
        super.messageSender = messageSender;
    }

    @Override
    public void constructMessage(String message) {
        super.messageSender.sendMessage(message);
    }
}
