package com.talevski.viktor;

import com.talevski.viktor.chain.SupportHandler;
import com.talevski.viktor.constructor.RequestClient;

/**
 * Reference link for the Chain Of Responsibility Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/chain-of-responsibility-pattern'.
 */
public class ChainOfResponsibilityDesignPatternApplication {
    public static void main(String[] args) {
        SupportHandler supportHandler = RequestClient.constructChainOfResponsibility();

        System.out.println("First level of support.");
        supportHandler.receiveRequest(SupportHandler.TECHNICAL, " I have a problem with my internet connectivity.");

        System.out.println();
        System.out.println("Second level of support.");
        supportHandler.receiveRequest(SupportHandler.BILLING, "Please resend my bill of this month.");

        System.out.println();
        System.out.println("Third level of support.");
        supportHandler.receiveRequest(SupportHandler.GENERAL, "Please send any other plans for home users.");

    }
}
