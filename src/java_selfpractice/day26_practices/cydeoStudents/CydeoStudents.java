package java_selfpractice.day26_practices.cydeoStudents;

public class CydeoStudents {


    /*Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()*/


    public String name;
    public int age, id;
    public char gender, grade;
    public int batchNumber, groupNumber;


    public static String schoolName = "Cydeo School";
    public static String magicWord = "Java";


    public CydeoStudents(String name, int age, int id, char gender, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public static void printSchoolName() {
        System.out.println("School name: " + schoolName);

    }

    public static void printProgLanguage() {

        System.out.println("Programming language: " + magicWord);
    }


    @Override
    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
