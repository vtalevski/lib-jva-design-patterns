package com.talevski.viktor;

public class EmployeeMemento {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String designation;

    public EmployeeMemento(Integer id, String name, String phoneNumber, String designation) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Memento object - The id is - '" + id + "', the name is - '" + name + "', the phone number is - '" + phoneNumber + "' and the designation is - '" + designation + "'.";
    }
}
