package java_programming.day25_constructor;

import java.time.LocalDate;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee e1 = new Employee("Vina", 34,'F', "Java Developer", 95000, LocalDate.of(2022,12,2));


        Employee e2 = new Employee("Zoe", 36,'F', "Project Manager", 12000, LocalDate.of(2021,05,01));



        System.out.println(e1);
        System.out.println(e2);




    }
}
