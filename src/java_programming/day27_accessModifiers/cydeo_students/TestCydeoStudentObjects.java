package java_programming.day27_accessModifiers.cydeo_students;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Ekaterina", 29, 'F');
        CydeoStudent student2 = new CydeoStudent("<Alena>", 28, 'F');


        System.out.println(student1);
        System.out.println(student2);


        // static doesn't supposed to be called through the object instead through the class name ,but we can still call the static object through the object name by typing ourselves ( object shares whatever the class has)
        System.out.println(student1.schoolName);

        System.out.println(student2.schoolName);


        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);


    }
}
