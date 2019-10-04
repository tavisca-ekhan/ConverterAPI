package com.tavisca.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tavisca.model.Employee;

import java.io.FileWriter;
import java.io.IOException;

public class CsvConverter extends Converter {

    public CsvConverter(Employee[] employees, String location) {
        super(employees, location);
    }

    @Override
    public void convert() throws JsonProcessingException {

        Employee[] employees = getEmployees();
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema  = csvMapper.schemaFor(Employee.class);
        String csvContent = csvMapper.writer(schema).writeValueAsString(employees);

        System.out.println(csvContent);
        createFile(csvContent);
    }

    private void createFile(String csvContent) {
        try (FileWriter file = new FileWriter(getLocation() + "/employees.csv")) {
            file.write(csvContent);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
