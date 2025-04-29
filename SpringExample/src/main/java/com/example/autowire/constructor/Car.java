package com.example.autowire.constructor;


public class Car {
    // car class is dependent on specification
    private Specification specification1;
    // for autowiring by constructor we need a constructor
    public Car(Specification specification1) {
        this.specification1 = specification1;
    }

//    public void setSpecification1(Specification specification) {
//        System.out.println("Setter setSpecification called from class : Car");
//        System.out.println("---Bean is injected using setSpecification function---");
//        this.specification1 = specification;
//    }
    public void displayDetails() {
        System.out.println("AUTOWIRE byName CAR DETAILS :  " + specification1.toString());
    }
}
