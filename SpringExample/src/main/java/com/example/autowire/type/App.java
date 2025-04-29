package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //loading the xml we made
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByType.xml");

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
