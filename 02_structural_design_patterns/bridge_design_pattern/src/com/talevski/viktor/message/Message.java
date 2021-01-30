package com.talevski.viktor.message;

import com.talevski.viktor.sender.MessageSender;

public abstract class Message {
    MessageSender messageSender;

    public abstract void constructMessage(String message);
}
