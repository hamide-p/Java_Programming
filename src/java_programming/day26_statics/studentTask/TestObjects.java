package java_programming.day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {

    /*
    Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list

     */

    public static void main(String[] args) {


        Student student1 = new Student("Dori", 21, 'F', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Maria", 22, 'F', "C56");
        Student student4 = new Student("Alva", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        // constructor gets executed separately for each object even if they have the same constructor names



        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles",  1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Glenio", 24, 'M', "B34");

        System.out.println(group1); // 6 students


        group1.removeStudent("E27");

        System.out.println(group1); // 5 students left in the group


        group1.removeStudent("A16");

        System.out.println(group1); // 4 students left in the group



        for (Student each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }


        System.out.println("\n..............................");


        StudentsGroup group2 = new StudentsGroup("Java",  12);

        Student student6 = new Student("Azure", 20, 'F', "126" );
        Student student7 = new Student("Flinn", 23, 'M', "127" );
        Student student8 = new Student("Samuel", 24, 'M', "128" );

        group2.addStudent(student6);
        group2.addStudent(student7);
        group2.addStudent(student8);



        StudentsGroup group3 = new StudentsGroup("Python",  123);
        Student student9 = new Student("Isabel", 25, 'F', "129" );
        Student student10 = new Student("Jonah", 22, 'M', "130" );

        group3.addStudent(student9);
        group3.addStudent(student10);


        StudentsGroup group4 = new StudentsGroup("C#",  1234);

        Student student11 = new Student("Samuel", 24, 'M', "131" );
        Student student12 = new Student("Adam", 27, 'M', "132" );

        group4.addStudent(student11);
        group4.addStudent(student12);


        StudentsGroup[] groups = {group1, group2, group3, group4};

        System.out.println(Arrays.toString(groups));


    }



}
