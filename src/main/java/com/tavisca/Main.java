package com.tavisca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tavisca.converter.Converter;
import com.tavisca.converter.CsvConverter;
import com.tavisca.converter.JsonConverter;
import com.tavisca.converter.XmlConverter;
import com.tavisca.model.CreateEmployee;
import com.tavisca.model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Employee[] employees = CreateEmployee.create();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Path for the files or else deafult path will be used");
        String path = scanner.nextLine();

        String storedPath = path.isEmpty() ? "C:\\Users\\mdkhan\\Desktop\\ConverterApiOutput" : path;

        Converter jsonConverter = new JsonConverter(employees, storedPath);
        jsonConverter.convert();

        Converter xmlConverter = new XmlConverter(employees, storedPath);
        xmlConverter.convert();

          Converter csvConverter = new CsvConverter(employees, storedPath);
          csvConverter.convert();
    }
}
