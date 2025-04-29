package com.example.componentscan;

import org.springframework.stereotype.Component;

//@Component("employee1") will not work with this
// name inside this and while making object the name should be same
//then only it will work
//Employee employee = (Employee) context.getBean("employee1", Employee.class); // will work when declared in App class
@Component("employee")
public class Employee {
    // by default class name is converted to lowercase and bean is registered
    // when we use @Component
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
