package com.talevski.viktor;

/**
 * Reference link for the Memento Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/memento-pattern'.
 */
public class MementoDesignPatternApplication {
    public static void main(String[] args) {
        EmployeeOriginator employeeOriginator = new EmployeeOriginator(123, "Isaac Newton", "123", "CTO");

        EmployeeMemento employeeMemento = employeeOriginator.saveToMemento();

        EmployeeCaretaker employeeCaretaker = new EmployeeCaretaker();
        employeeCaretaker.addEmployeeMemento(employeeMemento);

        System.out.println("Original EmployeeOriginator.");
        employeeOriginator.printOriginatorInformation();

        System.out.println();

        System.out.println("EmployeeOriginator after updating phone number.");
        employeeOriginator.setPhoneNumber("456");
        employeeMemento = employeeOriginator.saveToMemento();
        employeeCaretaker.addEmployeeMemento(employeeMemento);
        employeeOriginator.printOriginatorInformation();

        System.out.println();

        System.out.println("EmployeeOriginator after updating designation.");
        employeeOriginator.setDesignation("CEO");
        employeeMemento = employeeOriginator.saveToMemento();
        employeeCaretaker.addEmployeeMemento(employeeMemento);
        employeeOriginator.printOriginatorInformation();

        System.out.println();

        System.out.println("EmployeeOriginator after undoing designation update.");
        employeeMemento = employeeCaretaker.getEmployeeMemento();
        employeeOriginator.undoFromMemento(employeeMemento);
        employeeMemento = employeeCaretaker.getEmployeeMemento();
        employeeOriginator.undoFromMemento(employeeMemento);
        employeeOriginator.printOriginatorInformation();

        System.out.println();

        System.out.println("Original EmployeeOriginator after undoing phone number update.");
        employeeMemento = employeeCaretaker.getEmployeeMemento();
        employeeOriginator.undoFromMemento(employeeMemento);
        employeeOriginator.printOriginatorInformation();
    }
}
