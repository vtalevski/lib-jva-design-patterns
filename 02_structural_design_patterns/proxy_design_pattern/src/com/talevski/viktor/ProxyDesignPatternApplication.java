package com.talevski.viktor;

import com.talevski.viktor.generator.ReportGenerator;
import com.talevski.viktor.generator.ReportGeneratorImplProxy;
import com.talevski.viktor.model.Role;

/**
 * Reference link for the Proxy Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/proxy-pattern'.
 */
public class ProxyDesignPatternApplication {
    public static void main(String[] args) {
        Role accessRole = new Role();
        accessRole.setRole("Manager");

        ReportGenerator reportGeneratorImplProxy = new ReportGeneratorImplProxy(accessRole);

        reportGeneratorImplProxy.displayReportTemplate();
        reportGeneratorImplProxy.generateComplexReport("PDF", 150);
        reportGeneratorImplProxy.generateSensitiveReport("PDF");
    }
}
