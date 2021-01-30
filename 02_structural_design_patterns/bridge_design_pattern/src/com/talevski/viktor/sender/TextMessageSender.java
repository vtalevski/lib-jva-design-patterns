package com.talevski.viktor.sender;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
