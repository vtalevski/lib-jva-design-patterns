package com.talevski.viktor.sender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
