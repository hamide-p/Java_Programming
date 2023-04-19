package java_programming.day27_accessModifiers.CydeoStudents;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;


    public static String schoolName;
    public static String secretCode;


    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        /*  schoolName = "Cydeo School";
            secretCode = "Wooden Spoon"; // don't use it in the constructor, cause it sets the secretCode for each of the object one by one
        */

        }



        static{
        schoolName = "Cydeo School"; // Cydeo School assigned to the schoolName only one time
        secretCode = "Wooden Spoon";
        }



    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}






