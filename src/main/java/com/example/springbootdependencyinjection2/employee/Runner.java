package com.example.springbootdependencyinjection2.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

import java.io.File;

public class Runner {
    public static void main(String[] args) {
//Файл должен быть в каталоге "resources"
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Для передачи аргументов конструктору scope=prototype
        //Или аргументы передаются сразу <constructor-arg name="param1" value="default1" />
        Employee employee = (Employee)context.getBean("employee",1,"name1");
        employee.show();

    }
}
