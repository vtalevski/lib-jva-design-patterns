package com.talevski.viktor.bad;

public class OperaMailClient implements MailClient {

    @Override
    public void sendMail(String mailInfo) {
        System.out.println("Sending mail '" + mailInfo + "' via Opera Mail Client.");
    }

    @Override
    public void receiveMail(String mailInfo) {
        System.out.println("Receiving mail '" + mailInfo + "' via Opera Mail Client.");
    }

    @Override
    public boolean configureMailClientForWindows() {
        System.out.println("Configuring Opera Mail Client on Windows.");
        return true;
    }

    @Override
    public boolean configureMailClientForLinux() {
        System.out.println("Configuring Opera Mail Client on Linux.");
        return true;
    }
}
