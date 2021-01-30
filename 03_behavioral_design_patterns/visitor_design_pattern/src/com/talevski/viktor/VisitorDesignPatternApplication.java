package com.talevski.viktor;

import com.talevski.viktor.bad.MailClient;
import com.talevski.viktor.bad.OperaMailClient;
import com.talevski.viktor.good.visitor.LinuxMailClientVisitor;
import com.talevski.viktor.good.visitor.MacOsMailClientVisitor;
import com.talevski.viktor.good.visitor.MailClientVisitor;
import com.talevski.viktor.good.visitor.WindowsMailClientVisitor;

/**
 * Reference link for the Visitor Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/visitor-pattern'.
 */
public class VisitorDesignPatternApplication {
    public static void main(String[] args) {
        System.out.println("Bad example."); /* This is a bad example because if the specific mail client needs to be
                                               configured on another OS, the contract needs to change which leads to
                                               updating all of the implementations as well. This beaks the open/closed
                                               principle. */
        MailClient badOperaMailClient = new OperaMailClient();
        badOperaMailClient.configureMailClientForWindows();
        badOperaMailClient.sendMail("Hello sent from bad Opera mail client on Windows.");
        badOperaMailClient.receiveMail("Hello received from bad Opera mail client on Windows.");

        System.out.println();

        System.out.println("Good example.");
        MailClientVisitor windowsMailClientVisitor = new WindowsMailClientVisitor();
        MailClientVisitor linuxMailClientVisitor = new LinuxMailClientVisitor();
        MailClientVisitor macOsMailClientVisitor = new MacOsMailClientVisitor();

        com.talevski.viktor.good.MailClient goodOperaMailClient = new com.talevski.viktor.good.OperaMailClient();
        goodOperaMailClient.acceptMailClientVisitor(windowsMailClientVisitor);
        goodOperaMailClient.sendMail("Hello sent from good Opera mail client on Windows.");
        goodOperaMailClient.receiveMail("Hello received from good Opera mail client on Windows.");
    }
}
