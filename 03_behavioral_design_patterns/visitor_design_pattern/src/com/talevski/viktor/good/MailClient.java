package com.talevski.viktor.good;

import com.talevski.viktor.good.visitor.MailClientVisitor;

public interface MailClient {
    void sendMail(String mailContent);

    void receiveMail(String mailContent);

    boolean acceptMailClientVisitor(MailClientVisitor mailClientVisitor);
}
