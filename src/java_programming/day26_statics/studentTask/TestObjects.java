package java_programming.day26_statics.studentTask;

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













    }



}
