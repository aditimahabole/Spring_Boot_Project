package car.example.constructor.injection;

public class Car {
    // car class is dependent on specification
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {

        System.out.println("CAR DETAILS :  " + specification.toString());
    }

}
