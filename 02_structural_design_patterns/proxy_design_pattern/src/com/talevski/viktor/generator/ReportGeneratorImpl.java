package com.talevski.viktor.generator;

public class ReportGeneratorImpl implements ReportGenerator {
    public ReportGeneratorImpl() {
        System.out.println("This is the constructor of the ReportGeneratorImpl class.");
    }

    @Override
    public void displayReportTemplate() {
    }

    @Override
    public void generateComplexReport(String reportFormat, Integer reportEntries) {
        System.out.println("Generating complex report in '" + reportFormat + "' format with '" + reportEntries + "' entries.");
    }

    @Override
    public void generateSensitiveReport(String reportFormat) {
        System.out.println("Generating sensitive report in '" + reportFormat + "' format.");
    }
}
