package car.example.setter.injection;



public class Car {

    // car class is dependent on specification
    private Specification specification;

    // setter function to inject dependency
    public  void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("SETTER CAR DETAILS :  " + specification.toString());
    }
}
