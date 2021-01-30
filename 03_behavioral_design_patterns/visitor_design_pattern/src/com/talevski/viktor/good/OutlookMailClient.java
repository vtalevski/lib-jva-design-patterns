package com.talevski.viktor.good;

import com.talevski.viktor.good.visitor.MailClientVisitor;

public class OutlookMailClient implements MailClient {

    @Override
    public void sendMail(String mailInfo) {
        System.out.println("Sending mail '" + mailInfo + "' via Outlook Mail Client.");
    }

    @Override
    public void receiveMail(String mailInfo) {
        System.out.println("Sending mail '" + mailInfo + "' via Outlook Mail Client.");
    }

    @Override
    public boolean acceptMailClientVisitor(MailClientVisitor mailClientVisitor) {
        mailClientVisitor.visit(this);
        return true;
    }
}
