package java_programming.day29_inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {


        Student student1 = new Student("Sofia", 26, 'F', 'A', "MIT");

        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);

    }
}
