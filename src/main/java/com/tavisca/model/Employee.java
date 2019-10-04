package com.tavisca.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
    public final int id;
    public final String name;
    public final int age;
    public final String team;

    public Employee(int id, String name, int age, String team) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.team = team;
    }
}
