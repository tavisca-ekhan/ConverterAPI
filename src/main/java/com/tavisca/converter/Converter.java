package com.tavisca.converter;

import com.tavisca.model.Employee;

public abstract class Converter {
    public abstract void convert();
    private String location;
    private Employee[] employees;

    public Converter(Employee[] employees, String location) {
        this.employees = employees;
        this.location = location;
    }

    public String getLocation() { return location; }

    public Employee[] getEmployees() { return employees; }
}
