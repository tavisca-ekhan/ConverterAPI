package com.tavisca.model;

import java.util.ArrayList;
import java.util.List;

public class CreateEmployee {

    public static Employee[] create() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ebran Khan", 21, "GCE"));
        employees.add(new Employee(102, "Kumar Ankit", 23, "Flights"));
        employees.add(new Employee(103, "Somya Jana", 21, "CHAI"));
        employees.add(new Employee(104, "Rahul Pandey", 21, "Checkout"));
        employees.add(new Employee(105, "Rochit Agarwal", 21, "Manops"));
        employees.add(new Employee(106, "Aniket Singla", 21, "GCE"));
        employees.add(new Employee(107, "Tushar Jajodia", 21, "GCE"));
        employees.add(new Employee(108, "Rajat Kumar", 21, "GCE"));
        employees.add(new Employee(109, "Bibek BC", 23, "GCE"));
        employees.add(new Employee(110, "Manoj Singhi", 23, "GCE"));

        return employees.toArray(new Employee[employees.size()]);
    }
}
