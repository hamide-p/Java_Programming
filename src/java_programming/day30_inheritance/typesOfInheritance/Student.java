package java_programming.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Person{


    private char grade;
    private String studentId;


    public Student(String name, char gender, LocalDateTime DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade); // including additional instance variables grade and studentId
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }


}
