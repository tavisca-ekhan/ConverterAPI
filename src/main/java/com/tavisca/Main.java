package com.tavisca;

import com.tavisca.converter.Converter;
import com.tavisca.converter.JsonConverter;
import com.tavisca.converter.XmlConverter;
import com.tavisca.model.CreateEmployee;
import com.tavisca.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = CreateEmployee.create();

//        Converter jsonConverter = new JsonConverter(employees, "C:\\Users\\mdkhan\\Desktop\\ConverterApiOutput\\json");
//        jsonConverter.convert();

        Converter xmlConverter = new XmlConverter(employees, "C:\\Users\\mdkhan\\Desktop\\ConverterApiOutput\\xml");
        xmlConverter.convert();
    }
}
