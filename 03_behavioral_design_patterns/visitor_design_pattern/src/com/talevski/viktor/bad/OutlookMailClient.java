package com.talevski.viktor.bad;

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
    public boolean configureMailClientForWindows() {
        System.out.println("Configuring Outlook Mail Client on Windows.");
        return true;
    }

    @Override
    public boolean configureMailClientForLinux() {
        System.out.println("Configuring Outlook Mail Client on Linux.");
        return true;
    }
}
