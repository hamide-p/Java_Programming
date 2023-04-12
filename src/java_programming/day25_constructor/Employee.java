package java_programming.day25_constructor;

import java.time.LocalDate;

public class Employee {

    // they could have all different name, age, gender, jobTitle, salary, hired date
    public String name;

    public int age;

    public char gender;

    public String jobTitle;

    public double salary;

    public LocalDate hiredDate;


    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    } // allows us to set all the instance variables of the object as soon as the object is created


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate +
                '}';
    } // allows us to print the object when it's passed in the print statement



}


/*
name
age
gender
jobTitle
salary
hired date
 */