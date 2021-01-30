package com.talevski.viktor.bad;

public interface MailClient {
    void sendMail(String mailContent);

    void receiveMail(String mailContent);

    boolean configureMailClientForWindows();

    boolean configureMailClientForLinux();
}
