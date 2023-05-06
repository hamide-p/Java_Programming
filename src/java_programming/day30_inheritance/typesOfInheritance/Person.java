package java_programming.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;// date of birth

    private double salary;
    private String schoolName;


    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear()); // current year - return the birth year = age
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public void eat(String food) {
        System.out.println(name + " is eating food" + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + // we are getting the name of the class
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", salary=" + salary +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
