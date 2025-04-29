package com.example.autowire.type;


public class Car {
    // car class is dependent on specification
    private Specification specification1;

    //Example of autowire byName , we don't need a constructor as it happens by name of variable
    //initialization will be done by a setter function

    public void setSpecification1(Specification specification) {
        System.out.println("Setter setSpecification called from class : Car");
        System.out.println("---Bean is injected using setSpecification function---");
        this.specification1 = specification;
    }
    public void displayDetails() {
        System.out.println("AUTOWIRE byName CAR DETAILS :  " + specification1.toString());
    }
}
