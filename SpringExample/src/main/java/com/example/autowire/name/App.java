package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //loading the xml we made
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByName.xml");

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
        /*
        OUTPUT :
        -------
        Setter make called from class : Specification
        Setter model called from class : Specification
        Setter setSpecification called from class : Car
        ---Bean is injected using setSpecification function---
        AUTOWIRE byName CAR DETAILS :  Specification{make='Toyota', model='Corolla'}
         */
    }
}
