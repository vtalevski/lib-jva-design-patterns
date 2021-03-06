package com.talevski.viktor.good.visitor;

import com.talevski.viktor.good.OperaMailClient;
import com.talevski.viktor.good.OutlookMailClient;

public class MacOsMailClientVisitor implements MailClientVisitor {

    @Override
    public void visit(OperaMailClient operaMailClient) {
        System.out.println("Configuring Opera Mail Client on MacOS.");
    }

    @Override
    public void visit(OutlookMailClient outlookMailClient) {
        System.out.println("Configuring Outlook Mail Client on MacOS.");
    }
}
