package java_programming.day28_encapsulation.employee;

import java_programming.day28_encapsulation.employee.Employee;

public class TestEmployeeObject {

    public static void main(String[] args) {

      /*  Employee employee1 = new Employee();
        // employee1.salary = -20000

        //  employee1.setSalary(-100000); // Salary can not be negative: -100000.0

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());


        // employee1.setName("  "); // Employee name can not empty or blank

        employee1.setName("Hamide");
        System.out.println(employee1.getName());

*/


        Employee employee1 = new Employee("Hamide", 34, " Java Developer", 100000);

        System.out.println(employee1);


    }

}
