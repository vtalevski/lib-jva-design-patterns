package com.talevski.viktor.generator;

import com.talevski.viktor.model.Role;

public class ReportGeneratorImplProxy implements ReportGenerator {
    private ReportGenerator reportGenerator;
    private Role role;

    public ReportGeneratorImplProxy(Role role) {
        this.role = role;
    }

    @Override
    public void displayReportTemplate() {
        System.out.println("Display report template.");
    }

    @Override
    public void generateComplexReport(String reportFormat, Integer reportEntries) {
        if (reportGenerator == null) {
            reportGenerator = new ReportGeneratorImpl();
        }
        reportGenerator.generateComplexReport(reportFormat, reportEntries);
    }

    @Override
    public void generateSensitiveReport(String reportFormat) {
        if (role.getRole().equals("Manager")) {
            if (reportGenerator == null) {
                reportGenerator = new ReportGeneratorImpl();
            }
            reportGenerator.generateSensitiveReport(reportFormat);
        } else {
            System.out.println("You are not authorized to access sensitive reports.");
        }

    }
}
