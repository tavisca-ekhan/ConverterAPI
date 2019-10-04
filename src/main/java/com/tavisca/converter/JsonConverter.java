package com.tavisca.converter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tavisca.model.Employee;

import java.io.FileWriter;
import java.io.IOException;

public class JsonConverter extends Converter {
    public JsonConverter(Employee[] employees, String location) {
        super(employees, location);
    }

    @Override
    public void convert() {
        JsonArray employeesJsonArr = new JsonArray();

        for (Employee employee : getEmployees()) {
            JsonObject employeeObject = new JsonObject();

            employeeObject.addProperty("id", employee.id);
            employeeObject.addProperty("name", employee.name);
            employeeObject.addProperty("age", employee.team);
            employeeObject.addProperty("team", employee.team);

            employeesJsonArr.add(employeeObject);
        }

        System.out.println(employeesJsonArr.toString());
        createFile(employeesJsonArr);
    }

    private void createFile(JsonArray json) {
        try (FileWriter file = new FileWriter(getLocation() + "/employees.json")) {
            file.write(json.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
