package java_programming.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee { // multi-level inheritance (grandchildren of person class) ==> one class can be extended by MULTIPLE classes

    //  public class Teacher extends Employee, President { // one class can ONLY extend one class

    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    public void teach() {

        System.out.println(getName() + " is teaching");
    }


}
