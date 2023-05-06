package java_programming.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("Tokio", 'F', LocalDate.of(1989, 4, 16), 'A', "H20670493");


        President president = new President("Berlin", 'M', LocalDate.of(1981, 6, 11), LocalDate.of(2023, 2, 12));


        Teacher teacher = new Teacher("Professor", 'M', LocalDate.of(1981, 4, 11), "123", "Math Teacher", 78000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);


        student.study();
        teacher.teach();
        president.lie();

        System.out.println(".......................");


        student.eat("Pizza");
        teacher.eat("Spaghetti Carbonara");
        president.eat("Salad");


        System.out.println(".......................");

        student.drink("Red bull");
        teacher.drink("coffee");
        president.drink("water");


    }
}
