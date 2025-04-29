package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // now we are completely using annotations
        // we made AppConfig class in which we declared what package to scan
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("emp", Employee.class);
        System.out.println(employee.toString());
    }
}
