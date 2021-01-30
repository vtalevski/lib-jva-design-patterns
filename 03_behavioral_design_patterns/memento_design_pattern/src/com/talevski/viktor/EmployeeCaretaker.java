package com.talevski.viktor;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmployeeCaretaker {
    final Deque<EmployeeMemento> employeeMementos = new ArrayDeque<>();

    public void addEmployeeMemento(EmployeeMemento employeeMemento) {
        employeeMementos.push(employeeMemento);
    }

    public EmployeeMemento getEmployeeMemento() {
        return employeeMementos.pop();
    }
}
