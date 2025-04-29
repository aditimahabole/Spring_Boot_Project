package com.example.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //loading the xml we made
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
