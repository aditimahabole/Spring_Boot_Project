package com.example.componentscan;

import com.example.autowire.constructor.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //loading the xml we made
        ApplicationContext context
                = new ClassPathXmlApplicationContext("componentScanDemo.xml");
        Employee employee = (Employee) context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }
}
