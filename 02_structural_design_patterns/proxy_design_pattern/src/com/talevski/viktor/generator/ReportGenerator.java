package com.talevski.viktor.generator;

public interface ReportGenerator {
    void displayReportTemplate();

    void generateComplexReport(String reportFormat, Integer reportEntries);

    void generateSensitiveReport(String reportFormat);
}
