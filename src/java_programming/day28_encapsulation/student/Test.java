package java_programming.day28_encapsulation.student;

public class Test {


    public static void main(String[] args) {

     /*  Student student = new Student();
        student.age = -200; // since it's public, we cannot modify the incorrect value of the student's age, which cannot be a negative value such as minus 200. However, we can create rules to correct this value by making it private.

       System.out.println(student.age); // age is private



        */


        Student student = new Student();

        student.setAge(20);

        System.out.println(student.getAge()); // get method is INSTANCE method and instances are object members, so we call it by through the object names


        //  student.name = "Aaron";  // private access modifier, and we get error.

        //  student.setName("Aaron"); //when we don't set the name it gives the condition of  "Name has not been set "

        //student.setName("Arron123"); // Invalid Name: Arron123

        System.out.println(student.getName());


    }
}
