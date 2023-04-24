package java_selfpractice.day26_practices.cydeoStudents;

public class CydeoStudentsTestObject {

    public static void main(String[] args) {


        CydeoStudents student1 = new CydeoStudents("Pelin", 42, 427, 'F', 'A', 22, 3);

        CydeoStudents student2 = new CydeoStudents("Cem", 45, 234, 'M', 'A', 22, 4);


        System.out.println(student1);
        System.out.println(student2);

        student2.study(); // we call instance methods and variables through object names
        student1.attendClass();


        CydeoStudents.printSchoolName(); // // we call static methods and variables through class names
        CydeoStudents.printProgLanguage();


    }
}
