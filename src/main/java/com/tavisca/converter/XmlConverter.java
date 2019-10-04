package com.tavisca.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tavisca.model.Employee;

import java.io.FileWriter;
import java.io.IOException;


public class XmlConverter extends Converter {

    public XmlConverter(Employee[] employees, String location) {
        super(employees, location);
    }

    @Override
    public void convert() {
        XmlMapper xmlMapper = new XmlMapper();
        StringBuilder xmlContent = new StringBuilder();

        for (Employee employee : getEmployees()) {
            try {
                xmlContent.append(xmlMapper.writeValueAsString(employee));
                xmlContent.append("\n");
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        System.out.println(xmlContent.toString());
        createFile(xmlContent.toString());
    }

    private void createFile(String xmlContent) {
        try (FileWriter file = new FileWriter(getLocation() + "/employees.xml")) {
            file.write(xmlContent);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
