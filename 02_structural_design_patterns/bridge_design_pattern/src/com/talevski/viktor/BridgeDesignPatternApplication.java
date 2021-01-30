package com.talevski.viktor;

import com.talevski.viktor.message.EmailMessage;
import com.talevski.viktor.message.Message;
import com.talevski.viktor.message.TextMessage;
import com.talevski.viktor.sender.EmailMessageSender;
import com.talevski.viktor.sender.MessageSender;
import com.talevski.viktor.sender.TextMessageSender;

/**
 * Reference link for the Bridge Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/bridge-pattern'.
 */
public class BridgeDesignPatternApplication {
    /* Before reading the reasons why bridge pattern is used, read the article of the bad vs. the good example.
       1. The implementation is tightly coupled to the abstraction, or the contract.
       2. If we change something in the implementation, we will have to make changes in the abstraction as well.
       3. Inheritance violates encapsulation.
       4. Code reusability is not an option, because the abstraction and the implementation are tightly coupled together
          and if we want to use the implementation we will have to use the abstraction as well. */
    public static void main(String[] args) {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.constructMessage("Text message being sent...");

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.constructMessage("Email message being sent...");
    }
}
