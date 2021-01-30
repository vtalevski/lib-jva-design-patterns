package com.talevski.viktor;

public class EmployeeOriginator {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String designation;

    public EmployeeOriginator(Integer id, String name, String phoneNumber, String designation) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public EmployeeMemento saveToMemento() {
        return new EmployeeMemento(this.id, this.name, this.phoneNumber, this.designation);
    }

    public void undoFromMemento(EmployeeMemento employeeMemento) {
        this.id = employeeMemento.getId();
        this.name = employeeMemento.getName();
        this.phoneNumber = employeeMemento.getPhoneNumber();
        this.designation = employeeMemento.getDesignation();
    }

    public void printOriginatorInformation() {
        System.out.println("ID - " + this.id + "'.");
        System.out.println("Name - " + this.name + "'.");
        System.out.println("Phone number - " + this.phoneNumber + "'.");
        System.out.println("Designation - " + this.designation + "'.");
    }
}
